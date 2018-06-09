package com.earth.controller;

import com.earth.model.Emp;
import com.earth.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@RestController
public class ProviderEmpController {

    @Autowired
    private EmpService empService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/emp/{id}")
    public Emp get(@PathVariable Integer id) {
        return empService.get(id);
    }

    @GetMapping("/emp")
    public List<Emp> list() {
        return empService.list();
    }


    @RequestMapping(value = "/emp/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("PROVIDERTIANJIN-EMP");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
