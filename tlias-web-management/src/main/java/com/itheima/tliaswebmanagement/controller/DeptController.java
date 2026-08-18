package com.itheima.tliaswebmanagement.controller;

import com.itheima.tliaswebmanagement.pojo.Dept;
import com.itheima.tliaswebmanagement.pojo.Result;
import com.itheima.tliaswebmanagement.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts")
    public Result list() {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    /**
     * 删除部门 - 方式一：使用HttpServletRequest 获取请求参数
     */
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request) {
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("根据id删除部门：" + id);
//        return Result.success();
//    }

    /**
     * 删除部门 - 方式二：使用@RequestParam
     * 注意事项：一旦声明了@RequestParam，该参数在请求时必须传递，否则不传递就会报错。
     * 如果请求时没有传递该参数，可以使用@RequestParam(required = false)来解决。
     */
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam("id") Integer deptId) {
//        System.out.println("根据id删除部门：" + deptId);
//        return Result.success();
//    }

    /**
     * 删除部门 - 方式三：省略@RequestParam，前端传递的请求参数名和方法参数名一致，SpringBoot会自动将参数名和方法参数名进行匹配
     */
    @DeleteMapping("/depts")
    public Result delete(Integer id) {
        System.out.println("根据id删除部门：" + id);
        deptService.deleteById(id);
        return Result.success();
    }

}
