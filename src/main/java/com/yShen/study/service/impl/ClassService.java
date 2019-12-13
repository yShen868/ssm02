package com.yShen.study.service.impl;

import com.yShen.study.dao.IClassDao;
import com.yShen.study.dao.ITeacherDao;
import com.yShen.study.model.Class;
import com.yShen.study.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {
    IClassDao classDao;

    public IClassDao getClassDao() {
        return classDao;
    }
    @Autowired
    public void setClassDao(IClassDao classDao) {
        this.classDao = classDao;
    }

    @Override
    public int selectid(String class_name) {
        return classDao.selectid(class_name);
    }

    @Override
    public List<Class> selectids() {
        return classDao.selectids();
    }
}
