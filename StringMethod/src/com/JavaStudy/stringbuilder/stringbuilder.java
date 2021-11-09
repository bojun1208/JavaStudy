package com.JavaStudy.stringbuilder;

import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s_reverse = sb.toString();
        if(s.equals(s_reverse)){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
    }
}
