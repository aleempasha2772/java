package com.example.java;


class demo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
        }catch (Exception e){
            System.out.println("Exception" + e);
        }

    }
}


public class MultiThreading {
    public static void main(String[] args){
        int n = 9;
        for (int i = 0; i < n; i++) {
            demo demo = new demo();
            demo.start();
        }
    }
}
