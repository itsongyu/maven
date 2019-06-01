package com.tianmao.pojo;

public class User {
    private  String tname;
    private  int age;
    private  String sex;
    private   String pwd;

    @Override
    public String toString() {
        return "User{" +
                "tname='" + tname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getName() {
        return tname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.tname = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
