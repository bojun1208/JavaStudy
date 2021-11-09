package com.JavaStudy.login;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            String username = "admin";
            String password = "123456";
            System.out.println("Please Enter Username");
            String scUsername = sc.nextLine();
            System.out.println("Please Enter Password");
            String scPassword = sc.nextLine();
            if(username.equals(scUsername) && password.equals(scPassword)){
                System.out.println("Success");
                break;
            }else{
                System.out.println("Fail");
            }
        }

    }


}
