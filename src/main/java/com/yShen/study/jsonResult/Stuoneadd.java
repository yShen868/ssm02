package com.yShen.study.jsonResult;

public class Stuoneadd {
    private int sex_ss;
    private String name_ss;
    private String grade_ss;
    private int class_name;
    private int teacher_name;

    public Stuoneadd(int sex_ss, String name_ss, String grade_ss, int class_name, int teacher_name) {
        this.sex_ss = sex_ss;
        this.name_ss = name_ss;
        this.grade_ss = grade_ss;
        this.class_name = class_name;
        this.teacher_name = teacher_name;
    }

    public int getSex_ss() {
        return sex_ss;
    }

    public void setSex_ss(int sex_ss) {
        this.sex_ss = sex_ss;
    }

    public String getName_ss() {
        return name_ss;
    }

    public void setName_ss(String name_ss) {
        this.name_ss = name_ss;
    }

    public String getGrade_ss() {
        return grade_ss;
    }

    public void setGrade_ss(String grade_ss) {
        this.grade_ss = grade_ss;
    }

    public int getClass_name() {
        return class_name;
    }

    public void setClass_name(int class_name) {
        this.class_name = class_name;
    }

    public int getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(int teacher_name) {
        this.teacher_name = teacher_name;
    }

    @Override
    public String toString() {
        return "Stuoneadd{" +
                "sex_ss=" + sex_ss +
                ", name_ss='" + name_ss + '\'' +
                ", grade_ss='" + grade_ss + '\'' +
                ", class_name='" + class_name + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                '}';
    }
}
