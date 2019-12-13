package com.yShen.study.dao;

import com.yShen.study.model.Class;

import java.util.List;

public interface IClassDao {
    Integer selectid(String class_name);
    List<Class> selectids();
}
