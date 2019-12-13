package com.yShen.study.service.impl;

import com.yShen.study.dao.IAdminDao;
import com.yShen.study.model.Admin;
import com.yShen.study.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminService implements IAdminService {
    IAdminDao adminDao ;
    public IAdminDao getAdminDao() {
        return adminDao;
    }
    @Autowired
    public void setAdminDao(IAdminDao adminDao) {
        this.adminDao = adminDao;
    }


    @Override
    public Admin selectAdmin(String username) {
        Admin admin = adminDao.selectone(username);
        System.out.println(admin);
        return admin;
//        return null;
    }
}
