package com.yShen.study.model;

public class Admin {

    private Integer id ;
    private String username ;
    private String password ;
    private Integer permission ;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Admin() {
    }

    public Admin(Integer id, String username, String password, Integer permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public Admin(String username, String password, Integer permission) {
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permission=" + permission +
                '}';
    }
}
