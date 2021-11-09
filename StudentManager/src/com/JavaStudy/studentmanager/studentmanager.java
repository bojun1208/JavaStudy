package com.JavaStudy.studentmanager;

import com.JavaStudy.domain.student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentmanager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> list = new ArrayList<>();
        //student stu1 = new student("s100","mike",24,"2000-4-5");
        //list.add(stu1);
        //int index = getIndex(list,"s101");
        //System.out.println(index);

        lo:
        while (true) {
            System.out.println("-----Welcome to the student management system-----");
            System.out.println("1.Add student");
            System.out.println("2.Delete student");
            System.out.println("3.Modify student");
            System.out.println("4.View student");
            System.out.println("5.Exit");
            System.out.println("Please Enter:");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
//                    System.out.println("Add student");
                    addStudent(list);
                    break;
                case "2":
//                    System.out.println("Delete student");
                    deleteStudent(list);
                    break;
                case "3":
//                    System.out.println("Modify student");
                    modifyStudent(list);
                    break;
                case "4":
//                    System.out.println("View student");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("Thank you for using!");
                    break lo;
                default:
                    System.out.println("Wrong Input!");
            }
        }
    }

    public static void modifyStudent(ArrayList<student> list) {
        System.out.println("Please Enter the modified Sid");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int index = getIndex(list,sid);
        if (index == -1) {
            System.out.println("Not Exist");
        }else{
            System.out.println("Please Enter New Name");
            String name = sc.nextLine();
            System.out.println("Please Enter New Age");
            int age = sc.nextInt();
            System.out.println("Please Enter New Birthday");
            String birthday = sc.next();
            student stu = new student(sid,name,age,birthday);
            list.set(index,stu);
            System.out.println("Modify Successfully!");

        }
    }

    public static void deleteStudent(ArrayList<student> list) {
        System.out.println("Please Enter the unwanted Sid");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int index = getIndex(list,sid);
        if (index == -1) {
            System.out.println("Not Exist");
        }else{
            list.remove(index);
            System.out.println("Delete Successfully!");
        }
    }

    public static void queryStudent(ArrayList<student> list) {
        if (list.size() == 0) {
            System.out.println("Null!");
            return;
        }
        System.out.println("Sid\t\tName\tAge\t\tBirthday");
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBithday());
        }
    }

    public static int getIndex(ArrayList<student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            if (stu.getSid().equals(sid)) {
                index = i;
            }
        }
        return index;
    }

    public static void addStudent(ArrayList<student> list) {

        Scanner sc = new Scanner(System.in);
        String sid;

        while(true){
            System.out.println("Please Enter Sid");
            sid = sc.nextLine();
            int index = getIndex(list,sid);
            if (index == -1){
                break;
            }
        }

        System.out.println("Please Enter Name");
        String name = sc.nextLine();
        System.out.println("Please Enter Age");
        int age = sc.nextInt();
        System.out.println("Please Enter Birthday");
        String birthday = sc.next();
        student stu = new student(sid, name, age, birthday);
        list.add(stu);
        System.out.println("Add Successfully!");
    }
}
