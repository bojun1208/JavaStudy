package com.JavaStudy.findstringchar;

import java.util.Scanner;

public class findstringchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.println(c);
        }
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
