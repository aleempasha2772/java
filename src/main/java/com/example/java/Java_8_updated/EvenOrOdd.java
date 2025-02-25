package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args){
    	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    	Map<Boolean,List<Integer>> map = list.stream()
    			.collect(Collectors.partitioningBy(i->i%2==0));
    			
    	List<Integer> even = map.get(true);
    	System.out.println("Even Numbers:" + even);
    	List<Integer> odd = map.get(false);
    	System.out.print("Odd Numbers: "+odd);
    	
        
    }
}
