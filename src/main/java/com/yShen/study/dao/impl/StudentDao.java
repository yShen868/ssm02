package com.yShen.study.dao.impl;

import com.yShen.study.dao.IStudentDao;
import com.yShen.study.jsonResult.Stuoneup;
import com.yShen.study.model.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDao extends SqlSessionDaoSupport implements IStudentDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Student> selectAll(Integer pageOffset,Integer pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("pageOffset",pageOffset);
        map.put("pageSize",pageSize);
//        map.put("s_name",s_name);

        List<Student> students = getSqlSession().selectList("Student.selectAll",map);
        return students;
    }

    @Override
    public List<Student> selectByName(Integer pageOffset, Integer pageSize, String name) {

        Map<String,Object> map = new HashMap<>();
        map.put("pageOffset",pageOffset);
        map.put("pageSize",pageSize);
        map.put("s_name",name);
        System.out.println(map.get("s_name"));
        List<Student> students = getSqlSession().selectList("Student.selectByName",map);
        return students;
    }

    @Override
    public List<Student> selectStu() {
        List<Student> aa = getSqlSession().selectList("Student.selectstu");
        return aa;
    }

    @Override
    public int countstu() {
        int a = getSqlSession().selectOne("Student.countstu");

        return a;
    }

    @Override
    public int countstuByName(String name) {

        return getSqlSession().selectOne("Student.countstuByName",name);
    }

    @Override
    public void deletestu(int id) {
        getSqlSession().delete("Student.deletestu",id);
    }

    @Override
    public void addOne(Student student) {
        getSqlSession().insert("Student.insertstu",student);
    }

    @Override
    public void updateOne(Student student) {

        getSqlSession().update("Student.updatestu",student);
    }

    @Override
    public void updatename(int s_id, String s_name) {
        Map<String,Object> map = new HashMap<>();
        map.put("s_id",s_id);
        map.put("s_name",s_name);
        getSqlSession().update("Student.updatename",map);
    }

    @Override
    public int count_teacher(Integer id) {
        return getSqlSession().selectOne("Student.count_teacher",id);
    }
}
