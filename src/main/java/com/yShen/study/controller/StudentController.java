package com.yShen.study.controller;
import com.yShen.study.jsonResult.StudentResout;
import com.yShen.study.jsonResult.Stuoneadd;
import com.yShen.study.jsonResult.Stuoneup;
import com.yShen.study.model.Class;
import com.yShen.study.model.Student;
import com.yShen.study.model.Teacher;
import com.yShen.study.service.IAdminService;
import com.yShen.study.service.IClassService;
import com.yShen.study.service.IStudentService;
import com.yShen.study.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {


    ITeacherService teacherService;


    public ITeacherService getTeacherService() {
        return teacherService;
    }
    @Autowired
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }


    IClassService classService;

    public IClassService getClassService() {
        return classService;
    }
    @Autowired
    public void setClassService(IClassService classService) {
        this.classService = classService;
    }

    IStudentService studentService ;
    public IStudentService getStudentService() {
        return studentService;
    }
    @Autowired
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

//查询所有学生以及老师和班级
    @ResponseBody
    @RequestMapping(value = "/student_list" ,method = RequestMethod.GET)
    public StudentResout student_list(@RequestParam("page") Integer page,@RequestParam("limit") Integer limit) {
        List<Student> lists = studentService.selectStudents(page,limit);
//        System.out.println(lists);
//        返回的消息在这里 !!!
        StudentResout studentResout = new StudentResout();
        studentResout.setCount(studentService.countStu());
        studentResout.setData(lists);
        studentResout.setMsg("");
        studentResout.setCode(0);
//        System.out.println(studentResout);
        return studentResout;
    }
//根据id删除
    @ResponseBody
    @RequestMapping(value = "/student_delete" ,method = RequestMethod.POST)
    public GsonResult student_delete(@RequestParam("id") Integer id) {
        System.out.println(id);
        studentService.deleteone(id);
        GsonResult gsonResult = new GsonResult();
        gsonResult.setMsg("已删除");
        return gsonResult;
    }

//添加一个学生数据 传过来的是老师的姓名和班级名称


    @ResponseBody
    @RequestMapping(value = "/student_add" ,method = RequestMethod.POST)
    public GsonResult student_add(Stuoneadd student) {
//        System.out.println(student);
        studentService.addStu(student);
        GsonResult gsonResult = new GsonResult();
        gsonResult.setMsg("已添加");
        return gsonResult;
    }
//    更新
    @ResponseBody
    @RequestMapping(value = "/student_update" ,method = RequestMethod.POST)
    public GsonResult student_update(Stuoneup student) {
//        System.out.println(student);
        studentService.upStu(student);
        GsonResult gsonResult = new GsonResult();
        gsonResult.setMsg("已修改");
        return gsonResult;
    }

//     更新姓名
    @ResponseBody
    @RequestMapping(value = "/update_name" ,method = RequestMethod.POST)
    public int update_name(@RequestParam("s_id") int s_id,@RequestParam("s_name") String s_name) {
        studentService.updatename(s_id,s_name);
        return 1;
    }

//     查找
    @ResponseBody
    @RequestMapping(value = "/student_search" ,method = RequestMethod.POST)
    public StudentResout student_search(String name,Integer page,Integer limit) {


        StudentResout studentResout = new StudentResout();
        if (name.trim().equals("")){
            List<Student> lists = studentService.selectStudents(page,limit);
//        返回的消息在这里 !!!
            studentResout.setCount(studentService.countStu());
            studentResout.setData(lists);
            studentResout.setMsg("");
            studentResout.setCode(0);
            return studentResout;
        }else {
            List<Student> lists = studentService.selectStudentsByName(page,limit,name);
            studentResout.setCount(studentService.countStuByName(name));
            studentResout.setData(lists);
            studentResout.setMsg("");
            studentResout.setCode(0);
            return studentResout;
        }
    }
//  格式化时间
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
    }
//    select 下拉框查找班级
    @ResponseBody
    @RequestMapping(value = "/student_select")
    public List<Class> student_select() {
        List<Class> selectids = classService.selectids();
        return selectids;
    }

//    select 下拉框根据班级查找教师
    @ResponseBody
    @RequestMapping(value = "/student_select2" ,method = RequestMethod.POST)
    public List<Teacher> student_select2(@RequestParam("class_id") String class_id) {
        List<Teacher> selectids = teacherService.selectids(class_id);
        return selectids;
    }




    @RequestMapping(value = "/st" ,method = RequestMethod.GET)
    public String sss(){
        return "demo";

    }

}
