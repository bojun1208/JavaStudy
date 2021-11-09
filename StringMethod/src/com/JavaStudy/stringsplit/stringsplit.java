package com.JavaStudy.stringsplit;

import com.JavaStudy.domain.student;

import java.util.Scanner;

public class stringsplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter");
        String info = sc.nextLine();
        String[] sArr = info.split(",");
        student stu = new student(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"..."+stu.getAge());
    }
}
