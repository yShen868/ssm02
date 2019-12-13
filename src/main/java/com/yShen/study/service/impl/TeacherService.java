package com.yShen.study.service.impl;

import com.yShen.study.dao.ITeacherDao;
import com.yShen.study.model.Teacher;
import com.yShen.study.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService {

    ITeacherDao teacherDao;
    public ITeacherDao getTeacherDao() {
        return teacherDao;
    }
    @Autowired
    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public int selectid(String teacher_name) {
        return teacherDao.selectid(teacher_name);
    }

    @Override
    public List<Teacher> selectids(String class_id) {
        return teacherDao.selectids(class_id);
    }



    @Override
    public List<Teacher> selectAll(Integer page, Integer limit) {
        return teacherDao.selectAll(page, limit);
    }

    @Override
    public List<Teacher> selectAll(Integer page, Integer limit, String name) {
        return teacherDao.selectAll(page, limit,name);
    }


    @Override
    public void deleteone(Integer id) {
        teacherDao.delectone(id);
    }

    @Override
    public void updateone(Teacher teacher) {
        teacherDao.updateone(teacher);
    }

    @Override
    public void addone(Teacher teacher) {
        teacherDao.addone(teacher);
    }

    @Override
    public int selectCount() {
        return teacherDao.selectCount();
    }

    @Override
    public int selectCount(String name) {
        return teacherDao.selectCount(name);
    }


}
