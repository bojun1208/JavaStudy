package com.JavaStudy.getStudent;

import com.JavaStudy.domain.student;

import java.util.ArrayList;
import java.util.Scanner;

public class getStudent {
    public static void main(String[] args) {
        ArrayList<student> stuList = new ArrayList<>();
        student stu1 = getInfor();
        student stu2 = getInfor();
        student stu3 = getInfor();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        for (int i = 0; i < stuList.size(); i++) {
            student stu = stuList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }


    }

    private static student getInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Name");
        String name = sc.nextLine();
        System.out.println("Please Enter Age");
        int age = sc.nextInt();
        student stu = new student(name, age);
        return stu;
    }
}
