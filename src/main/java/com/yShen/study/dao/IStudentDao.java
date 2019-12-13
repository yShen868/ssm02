package com.yShen.study.dao;

import com.yShen.study.jsonResult.Stuoneup;
import com.yShen.study.model.Student;

import java.util.List;

public interface IStudentDao {

    List<Student> selectAll(Integer pageOffset,Integer pageSize);
    List<Student> selectByName(Integer pageOffset,Integer pageSize,String name);
    List<Student> selectStu();
    int countstu();
    int countstuByName(String name);
    void deletestu(int id);
    void addOne(Student student);
    void updateOne(Student student);


    void updatename(int s_id, String s_name);

    int count_teacher(Integer id);
}
