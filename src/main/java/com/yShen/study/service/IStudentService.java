package com.yShen.study.service;

import com.yShen.study.jsonResult.Stuoneadd;
import com.yShen.study.jsonResult.Stuoneup;
import com.yShen.study.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> selectStudents(Integer page,Integer limit);
    List<Student> selectStudentsByName(Integer page,Integer limit,String name);
    List<Student> selectStu(Integer page,Integer limit);
    int countStu();
    int countStuByName(String name);
    void deleteone(Integer id);

    void addStu(Stuoneadd stuoneadd);
    void upStu(Stuoneup stuoneadd);

    void updatename(int s_id, String s_name);

    int count_teacher(Integer id);
}
