package com.example.java.practice;

public class Reverse {

    public static void main(String[] args) {
        String str = "Aleem Pasha";
        String str1 = "Aleem Pasha";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
        
        for(int i=str.length()-1;i>=0;i--) {
        	System.out.print(str.charAt(i));
        }
    }
}
