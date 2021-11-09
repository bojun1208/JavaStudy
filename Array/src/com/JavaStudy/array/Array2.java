package com.JavaStudy.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please key in " + (i + 1) + " number");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
                sum += num;
            } else {
                System.out.println("Error");
                i--;
            }
        }
//        Double sum1 = (double) sum;
        System.out.println(max);
        System.out.println(min);
        System.out.println((double)(sum - max - min) / 4);
    }
}
