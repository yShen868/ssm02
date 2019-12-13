package com.yShen.study.dao.impl;

import com.yShen.study.dao.IAdminDao;
import com.yShen.study.model.Admin;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class AdminDao extends SqlSessionDaoSupport implements IAdminDao {


    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    //
//    @Override
//    public void add(Admin admin) {
//        getSqlSession().insert("Admin.add",admin);
//    }
    @Override
    public Admin selectone(String username) {
        return getSqlSession().selectOne("Admin.seleceadmin",username);
    }
}
