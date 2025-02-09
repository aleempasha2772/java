package com.example.java;

class MyRunnable implements Runnable{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=5;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Main {
    public static void main(String[] args) {
    	Thread t1 = new Thread(new MyRunnable(),"Thread-1");
    	MyThread t2 = new MyThread();
    	
    	t1.start();
    	t2.start();
    }
}
