package com.yShen.study.service.impl;

import com.yShen.study.dao.IDepartmentDao;
import com.yShen.study.model.Department;
import com.yShen.study.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    IDepartmentDao departmentDao;

    public IDepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    @Autowired
    public void setDepartmentDao(IDepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> selectids() {
        return departmentDao.selectids();
    }
}
