package com.earth.controller;

import com.earth.model.Emp;
import com.earth.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderEmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emp/{id}")
    public Emp get(@PathVariable Integer id){
        return empService.get(id);
    }

    @GetMapping("/emp")
    public List<Emp> list(){
        return empService.list();
    }

}
