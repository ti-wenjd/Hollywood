package com.earth.controller;


import com.earth.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {


    //private static final String REST_PREFIX_URL = "http://localhost:8001";
    private static final String REST_PREFIX_URL = "http://PROVIDERTIANJIN-EMP";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/emp/{id}")
    public Emp get(@PathVariable Integer id) {
        return restTemplate.getForObject(REST_PREFIX_URL + "/emp/" + id, Emp.class);
    }

    @GetMapping("/consumer/emp")
    public List<Emp> list() {
        return restTemplate.getForObject(REST_PREFIX_URL + "/emp", List.class);
    }

    @GetMapping("/consumer/emp/discover")
    public Object discover() {
        return restTemplate.getForObject(REST_PREFIX_URL + "/emp/discover", Object.class);
    }

}
