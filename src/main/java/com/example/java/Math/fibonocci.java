package com.example.java.Math;

public class fibonocci {
    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println("Cant get the result as input is 0");
        }
        int a=0;
        int b=1;
        int c;
        for (int i = 2; i <= n; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }

    public static void main(String[] args) {
       fibonacci(5);
    }
}
