package com.yShen.study.service.impl;

import com.yShen.study.dao.IStudentDao;
import com.yShen.study.jsonResult.Stuoneadd;
import com.yShen.study.jsonResult.Stuoneup;
import com.yShen.study.model.Student;
import com.yShen.study.service.IClassService;
import com.yShen.study.service.IStudentService;
import com.yShen.study.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
@Service("studentService")
public class StudentService implements IStudentService {
    IStudentDao studentDao;

    public IStudentDao getStudentDao() {
        return studentDao;
    }

    @Autowired
    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> selectStudents(Integer page, Integer limit ) {
        Integer pageOffset = (page-1)*limit;
        Integer pageSize = limit;
        return studentDao.selectAll(pageOffset,pageSize);
    }

    @Override
    public List<Student> selectStudentsByName(Integer page, Integer limit, String name) {

        Integer pageOffset = (page-1)*limit;
        Integer pageSize = limit;
        return studentDao.selectByName(pageOffset,pageSize,name);
    }


    IClassService classService;
    ITeacherService teacherService;

    public IClassService getClassService() {
        return classService;
    }
    @Autowired
    public void setClassService(IClassService classService) {
        this.classService = classService;
    }

    public ITeacherService getTeacherService() {
        return teacherService;
    }
    @Autowired
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public List<Student> selectStu(Integer page,Integer limit) {
        List<Student> listaa = studentDao.selectStu();
        return listaa;
    }

    @Override
    public int countStu() {
        return studentDao.countstu();
    }
    /*查询条数 controller*/
    @Override
    public int countStuByName(String name) {
        return studentDao.countstuByName(name);
    }

    @Override
    public void deleteone(Integer id) {
        studentDao.deletestu(id);
    }

    @Override
    public void addStu(Stuoneadd stuoneadd) {
//        查老师id和班级id
//        int class_id = classService.selectid(stuoneadd.getClass_name());
//        int teacher_id = teacherService.selectid(stuoneadd.getTeacher_name());
//        改成select后传到后台直接为id
        Student student = new Student();
        student.setClass_id(stuoneadd.getClass_name());
        student.setTeacher_id(stuoneadd.getTeacher_name());
        student.setS_name(stuoneadd.getName_ss());
        student.setSex(stuoneadd.getSex_ss());
        student.setGrade(stuoneadd.getGrade_ss());
        studentDao.addOne(student);

    }

    @Override
    public void upStu(Stuoneup stuoneup) {
        Student student = new Student();
        student.setClass_id(Integer.parseInt(stuoneup.getClass_id()));
        student.setTeacher_id(Integer.parseInt(stuoneup.getTeacher_id()));
        student.setS_name(stuoneup.getS_name());
        student.setSex(stuoneup.getSex());
        student.setGrade(stuoneup.getGrade());
        student.setS_id(stuoneup.getS_id());
//        System.out.println(student);
        studentDao.updateOne(student);

    }

    @Override
    public void updatename(int s_id, String s_name) {
        studentDao.updatename(s_id,s_name);
    }

    @Override
    public int count_teacher(Integer id) {
        return studentDao.count_teacher(id);
    }
}
