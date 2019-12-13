package com.yShen.study.controller;


import com.yShen.study.model.UserException;
import com.yShen.study.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {




    @RequestMapping("/member-list")
    public String member_list() {
        return "member-list";
    }

//学生列表
    @RequestMapping("/student-list")
    public String member1list1() {
        return "student_list";
    }

//教师列表
    @RequestMapping("/teacher-list")
    public String teacher_list() {
        return "teacher_list";
    }

    @RequestMapping("/title")
    public String title() {
        return "title";
    }

    @RequestMapping("/aaa")
    public String aaa() {
        return "demo";
    }

}
