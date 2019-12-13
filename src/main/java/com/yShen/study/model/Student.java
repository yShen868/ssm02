package com.yShen.study.model;

public class Student {

    private Integer s_id;
    private String s_name;
    private String grade;
    private Integer sex;//0男1女；
    private Integer class_id;
    private Integer teacher_id;

    private Teacher teacher;
    private Class aClass;

    public Student(Integer s_id, String name, String grade, Integer sex, Integer class_id, Integer teacher_id) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.grade = grade;
        this.sex = sex;
        this.class_id = class_id;
        this.teacher_id = teacher_id;
    }

    public Student() {
    }

    public Student(Integer s_id, String name, String grade, Integer sex, Integer class_id, Integer teacher_id, Class aClass) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.grade = grade;
        this.sex = sex;
        this.class_id = class_id;
        this.teacher_id = teacher_id;
        this.aClass = aClass;
    }

    public Student(String name, String grade, Integer sex, Integer class_id, Integer teacher_id) {
        this.s_name = s_name;
        this.grade = grade;
        this.sex = sex;
        this.class_id = class_id;
        this.teacher_id = teacher_id;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Student(String s_name, String grade, Integer sex, Integer class_id, Integer teacher_id, Teacher teacher, Class aClass) {
        this.s_name = s_name;
        this.grade = grade;
        this.sex = sex;
        this.class_id = class_id;
        this.teacher_id = teacher_id;
        this.teacher = teacher;
        this.aClass = aClass;
    }

    public Student(Integer s_id, String s_name, String grade, Integer sex, Integer class_id, Integer teacher_id, Teacher teacher, Class aClass) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.grade = grade;
        this.sex = sex;
        this.class_id = class_id;
        this.teacher_id = teacher_id;
        this.teacher = teacher;
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", grade='" + grade + '\'' +
                ", sex=" + sex +
                ", class_id=" + class_id +
                ", teacher_id=" + teacher_id +
                ", teacher=" + teacher +
                ", aClass=" + aClass +
                '}';
    }
}
