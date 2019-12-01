package com.lhy.cotroller;

import com.lhy.entity.Department;
import com.lhy.service.DepartmentDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentDAOService departmentDAOService;



    // 获取所有部门
    @RequestMapping("/selectAll")
    @ResponseBody
    public ArrayList selectAll() throws Exception{
        ArrayList<Department> departments = departmentDAOService.findAllDepartment();
        return departments;
    }

    // Hello
    @RequestMapping("/hello")
    @ResponseBody
    public String addDepartment(String number, String name){

        return "hello world";
    }


}
