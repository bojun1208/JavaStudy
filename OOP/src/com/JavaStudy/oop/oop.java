package com.JavaStudy.oop;

public class oop {
    public static void main(String[] args) {
        student stu = new student("mike",18);
        student stu1 = new student();
//        stu.name = "Peter";
        stu.setAge(12);
        stu.show();
        System.out.println(stu.getAge());

        autogenerate stu2 = new autogenerate();
        stu2.setName("haha");
        stu2.setAge(23);
        stu2.show();

        autogenerate stu3 = new autogenerate("zhang",44);
        stu3.show();
    }
}
