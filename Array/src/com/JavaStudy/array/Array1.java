package com.JavaStudy.array;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
//        char[] carr;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }
}
