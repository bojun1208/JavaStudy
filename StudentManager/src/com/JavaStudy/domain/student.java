package com.JavaStudy.domain;

public class student {
    String sid;
    String name;
    int age;
    String bithday;

    public student() {
    }

    public student(String sid, String name, int age, String bithday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.bithday = bithday;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBithday() {
        return bithday;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
    }
}
