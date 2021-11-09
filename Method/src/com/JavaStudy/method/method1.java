package com.JavaStudy.method;

public class method1 {
    public static void main(String[] args) {
        eat();
        System.out.println(add(10,10));
        int[] arr = {1,2,3,4,5};
        System.out.println(getMaxandMin(arr)[0]);
        System.out.println(getMaxandMin(arr)[1]);
    }
    public static void eat(){
        study();
        System.out.println("eat");
    }
    public static void study(){
        System.out.println("study");
    }
    public static int add(int a,int b){
        int c = a + b;
        return c;
    }

    public static int[] getMaxandMin(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        int[] output = {max,min};
        return output;
    }
}
