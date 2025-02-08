package com.example.java.StringManipulation;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Aleem Pasha";
		StringBuilder str = new StringBuilder(s);
		str.reverse().toString();
		System.out.println(str);
		
		String s1 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1 = s1+s.charAt(i);
		}
		System.out.print(s1);
	}
}
