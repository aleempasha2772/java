package com.example.java.Heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {
	Queue<Integer> leftMaxHeap;
    Queue<Integer> rightMinHeap;

    public FindMedianFromDataStream() {
        leftMaxHeap = new PriorityQueue<>((n1,n2)-> n2-n1);
        rightMinHeap = new PriorityQueue<>((n1,n2)-> n1-n2);
    }
    
    public void addNum(int num) {
        leftMaxHeap.add(num);
        rightMinHeap.add(leftMaxHeap.poll());
        if(leftMaxHeap.size() < rightMinHeap.size()){
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.size() > rightMinHeap.size()){
            return leftMaxHeap.peek();
        }
        return (leftMaxHeap.peek()+rightMinHeap.peek())/2.0;
    }
    
    public static void main(String[] args) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();

        // Test Case 1: Add 1
        // Stream: [1] -> Median is 1.0
        medianFinder.addNum(1);
        System.out.println("Added 1. Median: " + medianFinder.findMedian());

        // Test Case 2: Add 2
        // Stream: [1, 2] -> Median is (1+2)/2 = 1.5
        medianFinder.addNum(2);
        System.out.println("Added 2. Median: " + medianFinder.findMedian());

        // Test Case 3: Add 3
        // Stream: [1, 2, 3] -> Median is 2.0
        medianFinder.addNum(3);
        System.out.println("Added 3. Median: " + medianFinder.findMedian());

        // Test Case 4: Add 4
        // Stream: [1, 2, 3, 4] -> Median is (2+3)/2 = 2.5
        medianFinder.addNum(4);
        System.out.println("Added 4. Median: " + medianFinder.findMedian());
        
        // Test Case 5: Add 5
        // Stream: [1, 2, 3, 4, 5] -> Median is 3.0
        medianFinder.addNum(5);
        System.out.println("Added 5. Median: " + medianFinder.findMedian());
    }

}
