package com.yShen.study.service;

import com.yShen.study.model.Class;

import java.util.List;

public interface IClassService {

    int selectid(String class_name);
    List<Class> selectids();

}
