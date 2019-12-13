package com.yShen.study.service;

import com.yShen.study.model.Teacher;

import java.util.List;

public interface ITeacherService {

    int selectid(String teacher_name);
    List<Teacher> selectids(String class_id);

//    List<Teacher> selectAll();

    int selectCount();

    int selectCount(String name);

    List<Teacher> selectAll(Integer page, Integer limit);
    List<Teacher> selectAll(Integer page, Integer limit, String name);


    void deleteone(Integer id);

    void updateone(Teacher teacher);

    void addone(Teacher teacher);


}
