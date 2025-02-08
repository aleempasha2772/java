package com.example.java.StringManipulation;

public class Vowels {
	public static void main(String[] args) {
		String s = "Aleem";
		String s1 = s.toLowerCase();
		char[] a = s1.toCharArray();
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			if(a[i]=='a'|| a[i] =='e'|| a[i] == 'i'|| a[i]=='o'||a[i]=='u') {
				v++;
			}else {
				c++;			}
		}
		System.out.println(v);
		System.out.println(c);
	}
}
