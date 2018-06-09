package com.earth.service.impl;

import com.earth.dao.EmpDao;
import com.earth.model.Emp;
import com.earth.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public Emp get(Integer id) {
        return empDao.get(id);
    }

    @Override
    public List<Emp> list() {
        return empDao.list();
    }
}
