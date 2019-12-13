package com.yShen.study.dao.impl;

import com.yShen.study.dao.ITeacherDao;
import com.yShen.study.model.Teacher;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TeacherDao extends SqlSessionDaoSupport implements ITeacherDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int selectid(String teacher_name) {
        int a = getSqlSession().selectOne("Teacher.selectid",teacher_name);
        return a;
    }

    @Override
    public List<Teacher> selectids(String class_id) {
        List<Teacher> list = getSqlSession().selectList("Teacher.selectids",class_id);
        return list;
    }



    @Override
    public List<Teacher> selectAll(Integer page, Integer limit) {
        Map<String,Integer> map = new HashMap<>();
        Integer pageOffset = (page-1)*limit;
        Integer pageSize = limit;
        map.put("pageOffset",pageOffset);
        map.put("pageSize",pageSize);
        return getSqlSession().selectList("Teacher.selectAll",map);
    }

    @Override
    public List<Teacher> selectAll(Integer page, Integer limit, String name) {
        Map<String,Object> map = new HashMap<>();
        Integer pageOffset = (page-1)*limit;
        Integer pageSize = limit;
        map.put("pageOffset",pageOffset);
        map.put("pageSize",pageSize);
        map.put("name",name);
        return getSqlSession().selectList("Teacher.selectAll",map);
    }

    @Override
    public void delectone(Integer id) {
        getSqlSession().delete("Teacher.deleteone",id);
    }

    @Override
    public void updateone(Teacher teacher) {
        getSqlSession().update("Teacher.updateone",teacher);
    }

    @Override
    public void addone(Teacher teacher) {
        getSqlSession().insert("Teacher.addone",teacher);
    }

    @Override
    public int selectCount() {
        return getSqlSession().selectOne("Teacher.selectCount");
    }

    @Override
    public int selectCount(String name) {
        Map<String,String> map = new HashMap<>();
        map.put("name",name);
        return getSqlSession().selectOne("Teacher.selectCountname",map);
    }


}
