package com.yShen.study.model;

public class Teacher {

    private Integer id;
    private String name;
    private String phone;
    private String email;
    private Double salary;
    private Integer class_id;
    private Integer department_id;

    private Class aClass;
    private Department department;

    public Teacher(Integer id, String name, String phone, String email, Double salary, Integer class_id, Integer department_id) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.class_id = class_id;
        this.department_id = department_id;
    }

    public Teacher() {
    }

    public Teacher(String name, String phone, String email, Double salary, Integer class_id, Integer department_id) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.class_id = class_id;
        this.department_id = department_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", class_id=" + class_id +
                ", department_id=" + department_id +
                ", aClass=" + aClass +
                ", department=" + department +
                '}';
    }
}
