package com.example.java.NumberTheory_BasicMaths;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "Aleem".toLowerCase();
		StringBuilder strRev = new StringBuilder(str);
		System.out.println(strRev.reverse().toString());
		
		char[] str1 = str.toCharArray();
		char[] str2 = new char[str1.length];
		
		for(int i=str1.length-1;i>=0;i--) {
			str2[i] = str1[i];
		}
		
//		for (int i = str1.length - 1; i >= 0; i--) {
//            int newIndex = str1.length - 1 - i;
//            str2[newIndex] = str1[i];
//        }
		
		System.out.print(new String(str2));
		
		
		
	}
}
