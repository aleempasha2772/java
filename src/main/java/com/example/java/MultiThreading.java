package com.example.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//    	MyThreadA A = new MyThreadA();
//    	MyThreadB C = new MyThreadB();
//    	Thread B = new Thread(new MyThreadB(),"Thread-1");
//    	A.start();
//    	A.join();
//    	B.start();
    	
    	
    	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
    	list.stream()
    	.filter(i->i%2==0)
    	.forEach(System.out::println);
    	
    	List<Integer> list1 = Arrays.asList(11,2,3,14,5,6,117,8,9,10);
    	list1.stream()
    	.map(s->s+"")
    	.filter(s->s.startsWith("1"))
    	.forEach(System.out::println);
    	
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        myList.stream()
        .distinct()
        .forEach(System.out::println);
        
        
        String input = "Java articles are Awesome";
        
        Character result = input.chars()
        		.mapToObj(c->(char) c)
        		.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
        		.findFirst()
        		.orElse(null);
        
        System.out.println(result);
        
        
        Set<Character> set = new HashSet<>();
        
        Character result2 = input.chars()
        		.mapToObj(c->(char) c)
        		.filter(c-> !set.add(c))
        		.findFirst()
        		.orElse(null);
        System.out.println(result2);
        
    	
    }
}
