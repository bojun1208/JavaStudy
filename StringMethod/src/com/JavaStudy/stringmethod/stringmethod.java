package com.JavaStudy.stringmethod;

public class stringmethod {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);
        System.out.println(b1);
        System.out.println(b2);

        boolean b3 = s1.equalsIgnoreCase(s2);
        System.out.println(b3);


    }
}
