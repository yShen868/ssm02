package com.yShen.study.jsonResult;

public class Stuoneup {
    private Integer s_id;
    private Integer sex;
    private String s_name;
    private String teacher_id;
    private String class_id;
    private String grade;

    public Stuoneup(Integer s_id, Integer sex, String s_name, String teacher_id, String class_id, String grade) {
        this.s_id = s_id;
        this.sex = sex;
        this.s_name = s_name;
        this.teacher_id = teacher_id;
        this.class_id = class_id;
        this.grade = grade;
    }


    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Stuoneup{" +
                "s_id=" + s_id +
                ", sex=" + sex +
                ", s_name='" + s_name + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", class_id='" + class_id + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}


