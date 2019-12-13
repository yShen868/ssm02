package com.yShen.study.dao;

import com.yShen.study.model.Admin;

public interface IAdminDao {
    //    void add(Admin admin);
    Admin selectone(String username);
}
