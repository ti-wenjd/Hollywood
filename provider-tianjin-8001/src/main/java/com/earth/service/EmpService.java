package com.earth.service;

import com.earth.model.Emp;

import java.util.List;

public interface EmpService {

    public Emp get(Integer id);

    public List<Emp> list();

}
