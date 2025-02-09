package com.example.java;


class MyThreadA extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(i*50);
			}catch(InterruptedException e){
				e.getLocalizedMessage();
			}
		}
	}
}

class MyThreadB implements Runnable{
	public void run() {
		for(int i=5;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(i*100);
			}catch(InterruptedException e) {
				e.getLocalizedMessage();
			}
		}
	}
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
    	MyThreadA A = new MyThreadA();
    	Thread B = new Thread(new MyThreadB(),"Thread-1");
    	A.start();
    	A.join();
    	B.start();
    }
}
