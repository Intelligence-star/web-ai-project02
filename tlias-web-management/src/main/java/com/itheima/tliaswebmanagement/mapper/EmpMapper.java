package com.itheima.tliaswebmanagement.mapper;

import com.itheima.tliaswebmanagement.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 员工信息
 */
@Mapper
public interface EmpMapper {

    /**
     * 查询员工总数
     */
    @Select("SELECT COUNT(*) FROM emp e LEFT JOIN dept d ON e.dept_id = d.id")
    public Long count();

    /**
     * 查询员工列表
     */
    @Select("SELECT e.*, d.name AS deptName FROM emp e LEFT JOIN dept d ON e.dept_id = d.id " +
            "ORDER BY e.update_time DESC LIMIT #{start},#{pageSize}")
    public List<Emp> list(Integer start, Integer pageSize);
}
