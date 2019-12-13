package com.yShen.study.controller;


import com.yShen.study.model.Class;
import com.yShen.study.model.Department;
import com.yShen.study.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {

    IDepartmentService departmentService;

    public IDepartmentService getDepartmentService() {
        return departmentService;
    }
    @Autowired
    public void setDepartmentService(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    //    select 下拉框查找班级
    @ResponseBody
    @RequestMapping(value = "/department_select")
    public List<Department> student_select() {
        List<Department> selectids = departmentService.selectids();
//        System.out.println(selectids);
        return selectids;
    }

}
