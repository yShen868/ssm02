package com.yShen.study.dao;

import com.yShen.study.model.Teacher;

import java.util.List;

public interface ITeacherDao {

    int selectid(String teacher_name);

    List<Teacher> selectids(String class_id);

    int selectCount();

    int selectCount(String name);

    List<Teacher> selectAll(Integer page, Integer limit);

    List<Teacher> selectAll(Integer page, Integer limit, String name);

    void delectone(Integer id);

    void updateone(Teacher teacher);

    void addone(Teacher teacher);

}
