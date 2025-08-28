package com.example.java.Java_8_updated;

//import com.example.java.MyThreadA;

class MyClassA extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(Thread.currentThread().getName()+ " "+ i);
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.print(e.getLocalizedMessage());
			}
		}
	}
}

public class MultiThreading{
	public static void main(String[] args) {
		MyClassA A = new MyClassA();
		A.start();
	}
}
