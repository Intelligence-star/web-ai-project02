package com.itheima.tliaswebmanagement.mapper;

import com.itheima.tliaswebmanagement.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询所有部门
     * @return
     */

    //方式一：手动结果映射
        @Results({
                @Result(column = "create_time", property = "createTime"),
                @Result(column = "update_time", property = "updateTime")
        })

    //方式二：在SQL语句中起别名
    //    @Select("SELECT id, name, create_time AS createTime, update_time AS updateTime FROM dept ORDER BY update_time DESC;")
    //    List<Dept> findAll();

    //方式三：在application.yml文件中配置开启驼峰命名

    @Select("SELECT id, name, create_time, update_time FROM dept ORDER BY update_time DESC;")
    List<Dept> findAll();
}
