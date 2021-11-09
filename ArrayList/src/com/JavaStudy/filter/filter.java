package com.JavaStudy.filter;

import com.JavaStudy.domain.student;

import java.util.ArrayList;

public class filter {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        student stu1 = new student("Peter",15);
        student stu2 = new student("Mike",19);
        student stu3 = new student("May",14);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<student> newList = getAge(list);

        for (int i = 0; i < newList.size(); i++) {
            student stu = newList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
    public static ArrayList<student> getAge(ArrayList<student> list){
        ArrayList<student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            if(stu.getAge() < 18){
                newList.add(stu);
            }
        }
        return newList;
    }
}
