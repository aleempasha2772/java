package com.example.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()){
            return false;
        }
        return true;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num-> !set.add(num));
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums1 = {1,2,3,4,5,6,7,8,9,9};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums1));

    }
}
