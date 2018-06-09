package com.earth.controller;

import com.earth.model.Emp;
import com.earth.service.EmpService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@RestController
public class ProviderEmpController {

    @Autowired
    private EmpService empService;


    @GetMapping("/emp/{id}")
    @HystrixCommand(fallbackMethod = "process_get")
    public Emp get(@PathVariable Integer id) {
        Emp emp = empService.get(id);
        if(null == emp){
            throw new RuntimeException("不存在");
        }
        return emp;
    }

    public Emp process_get(@PathVariable Integer id){
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName("该"+id+"不存在，provider中断了---@EnableCircuitBreaker");
        emp.setSource("no source");
        return emp;
    }
    @GetMapping("/emp")
    public List<Emp> list() {
        return empService.list();
    }




}
