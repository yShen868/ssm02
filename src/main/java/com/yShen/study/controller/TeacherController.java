package com.yShen.study.controller;


import com.yShen.study.jsonResult.StudentResout;
import com.yShen.study.model.Teacher;
import com.yShen.study.service.IStudentService;
import com.yShen.study.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeacherController {
    ITeacherService teacherService;
    IStudentService studentService;

    public IStudentService getStudentService() {
        return studentService;
    }
    @Autowired
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public ITeacherService getTeacherService() {
        return teacherService;
    }
    @Autowired
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }


//    http://localhost:8079/ssm_02/teacher_list?page=1&limit=10

    @ResponseBody
    @RequestMapping(value = "/teacher_list" ,method = RequestMethod.GET)
    public StudentResout Teacher_list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit){
//        @RequestParam("page") Integer page,@RequestParam("limit") Integer limit
//        System.out.println(123);
        List<Teacher> list = teacherService.selectAll(page,limit);
        StudentResout studentResout = new StudentResout();
//        code ：0成功 1失败
        studentResout.setCode(0);
        studentResout.setMsg("没有查询到数据");
        studentResout.setData(list);
        studentResout.setCount(teacherService.selectCount());
//        System.out.println(studentResout);
        return studentResout;
    }

    @ResponseBody
    @RequestMapping(value = "/teacher_search" ,method = RequestMethod.POST)
    public StudentResout teacher_search(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit,@RequestParam("name") String name){

        List<Teacher> list = teacherService.selectAll(page,limit,name);
        StudentResout studentResout = new StudentResout();
//        code ：0成功 1失败
        studentResout.setCode(0);
        studentResout.setMsg("没有查询到数据");
        studentResout.setData(list);
        studentResout.setCount(teacherService.selectCount(name));
//        System.out.println(studentResout);
        return studentResout;
    }


    @ResponseBody
    @RequestMapping(value = "/teacher_delete" ,method = RequestMethod.POST)
    public GsonResult teacher_delete(@RequestParam("id") Integer id) {
//        System.out.println(id);
        GsonResult gsonResult = new GsonResult();
        int count = studentService.count_teacher(id);

        if (count >0) {
            gsonResult.setMsg("学生正在使用,不能删除");
            gsonResult.setCode(1);
        }else {
            teacherService.deleteone(id);
            gsonResult.setMsg("已删除");
            gsonResult.setCode(0);
        }
        return gsonResult;
    }


    @RequestMapping(value = "/sss" ,method = RequestMethod.GET)
    public String ss(){
//        System.out.println(teacherService.selectid("1"));
//        System.out.println(classService.selectid("1"));
        return "demo";

    }

    @ResponseBody
    @RequestMapping(value = "/teacher_update" ,method = RequestMethod.POST)
    public String teacher_update(Teacher teacher,int department_name,int class_name){
//        System.out.println("获取成功");
        teacher.setDepartment_id(department_name);
        teacher.setClass_id(class_name);
        teacherService.updateone(teacher);
        return "修改成功";

    }


    @ResponseBody
    @RequestMapping(value = "/teacher_add" ,method = RequestMethod.POST)
    public String teacher_add(Teacher teacher,int department_name,int class_name){
//        System.out.println("添加成功");
//        System.out.println(teacher);
        teacher.setDepartment_id(department_name);
        teacher.setClass_id(class_name);
        teacherService.addone(teacher);
        return "添加成功";

    }
}
