package com.JavaStudy.oop;

public class student {
    private int age;
    String name;
    public student(){}
    public student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        if(age <= 0 || age >= 120){
            System.out.println("Error");
        }else{
            System.out.println("Correct");
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
