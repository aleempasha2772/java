package com.example.java.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedChar {
    public static void main(String[] args){
        String input = "Java articles are Awesome";

        Character ch = input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()==1L)
                .map(i->i.getKey())
                .findFirst()
                .get();
        System.out.println(ch);

    }
}
