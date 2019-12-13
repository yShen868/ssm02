package com.yShen.study.dao;

import com.yShen.study.model.Admin;

public interface IAdminDao {
    // 测试是否成功
    //    void add(Admin admin);
    Admin selectone(String username);
}
