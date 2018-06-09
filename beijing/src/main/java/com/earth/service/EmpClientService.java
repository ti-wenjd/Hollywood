package com.earth.service;


import com.earth.model.Emp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "PROVIDER-TIANJIN",fallbackFactory = EmpClientFallBackFactory.class)
public interface EmpClientService {

    @GetMapping("/emp/{id}")
    Emp get(@PathVariable("id") Integer id);

    @GetMapping("/emp")
    List<Emp> list();
}
