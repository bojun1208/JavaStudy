package com.JavaStudy.listswitch;

public class listswitch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int start = 0, end = arr.length-1; start < end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
