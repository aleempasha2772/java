package com.example.java.cap;

@FunctionalInterface
interface AddOperation {
	int add(int a, int b);
}


public class Sum {
	public static void main() {
		AddOperation add = (int a,int b)-> a+b;
		
		int c = add.add(1,2);
		System.out.print(c);
		
	}

}
