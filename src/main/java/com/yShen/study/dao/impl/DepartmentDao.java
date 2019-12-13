package com.yShen.study.dao.impl;

import com.yShen.study.dao.IDepartmentDao;
import com.yShen.study.model.Department;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class DepartmentDao extends SqlSessionDaoSupport implements IDepartmentDao {
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Department> selectids() {
        return getSqlSession().selectList("Department.selectids");
    }
}
