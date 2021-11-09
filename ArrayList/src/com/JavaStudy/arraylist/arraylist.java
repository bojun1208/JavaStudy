package com.JavaStudy.arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("11");
        arrList.add("22");
        arrList.add("33");
        arrList.add(0,"44");
        System.out.println(arrList);
    }
}
