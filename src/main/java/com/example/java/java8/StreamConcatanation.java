package com.example.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatanation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        Stream<String> stream = Stream.concat(list.stream(),list2.stream());
        stream.forEach(System.out::println);
    }
}
