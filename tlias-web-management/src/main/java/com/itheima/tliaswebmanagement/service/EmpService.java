package com.itheima.tliaswebmanagement.service;

import com.itheima.tliaswebmanagement.pojo.Emp;
import com.itheima.tliaswebmanagement.pojo.PageResult;


public interface EmpService {

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageResult<Emp> page(Integer page, Integer pageSize);

    /**
     * 添加员工信息
     * @param emp
     */
    void save(Emp emp);
}
