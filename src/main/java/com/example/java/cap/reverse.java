package com.example.java.cap;

public class reverse {
	public static void main(String[] main) {
		int n = 2792;
		
		String str = "2792";
		
		StringBuilder sb = new StringBuilder(str);
		
		String str2String = sb.reverse().toString();
		System.out.println(str2String);
		
		
		
		int reversed = 0;
		while(n!=0) {
			int rem = n%10;
			reversed = reversed*10+rem;
			n= n/10;
		}
		System.out.println(reversed);
		
		
		int n1 = 10;
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=2;i<n1;i++) {
			c = a+b;
			System.out.print(c+" ");
			a =b;
			b = c;
			
		}
		
		int p = 5;
		
		for(int i=2;i<p;i++) {
			if(p%i==0) {
				System.out.print("not Prime");
			}else {
				System.out.print("is prime");
			}
		}
		
		
	}

}
