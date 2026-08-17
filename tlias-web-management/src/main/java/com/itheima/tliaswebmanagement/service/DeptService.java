package com.itheima.tliaswebmanagement.service;


import com.itheima.tliaswebmanagement.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> findAll();
}
