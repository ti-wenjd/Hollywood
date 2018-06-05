package com.earth.dao;

import com.earth.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {

    public Emp get(Integer id);

    public List<Emp> list();
}
