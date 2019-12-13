package com.yShen.study.dao.impl;

import com.yShen.study.dao.IClassDao;
import com.yShen.study.model.Class;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class ClassDao  extends SqlSessionDaoSupport implements IClassDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public Integer selectid(String class_name) {
        Integer a = getSqlSession().selectOne("Class.selectid",class_name);
        return a;
    }

    @Override
    public List<Class> selectids() {
        List<Class> list = getSqlSession().selectList("Class.selectids");
        return list;
    }
}
