package com.earth.controller;


import com.earth.model.Emp;
import com.earth.service.EmpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private EmpClientService empClientService;

    @GetMapping("/consumer/emp/{id}")
    public Emp get(@PathVariable Integer id) {
        return empClientService.get(id);
    }

    @GetMapping("/consumer/emp")
    public List<Emp> list() {
        return empClientService.list();
    }


}
