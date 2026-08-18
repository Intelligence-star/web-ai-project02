package com.itheima.tliaswebmanagement.service;


import com.itheima.tliaswebmanagement.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据id删除部门
     * @param id
     */
    void deleteById(Integer id);
}
