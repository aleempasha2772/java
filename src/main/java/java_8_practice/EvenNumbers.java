package java_8_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {
	//Write a Java 8 program to filter and print even numbers from a list.
	public static void main(String[] main) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("-----Even--------");

		List<Integer> even = numbers.stream()
				.filter(i->i%2==0)
				.collect(Collectors.toList());
		System.out.println(even);
		
		System.out.println("-----squares--------");

		List<Integer> squares = numbers.stream()
				.map(i->i*i)
				.collect(Collectors.toList());
		System.out.println(squares);
		System.out.println("-----max element in list--------");
		
		int max = numbers.stream()
		.max(Integer::compare)
		.get();
		
		System.out.println(max);
		System.out.println("-----totoal elements--------");
		Long count = numbers.stream()
				.count();
		System.out.println(count);
		//alphabetical order 
		System.out.println("-----alphabetica--------");
		List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
		List<String> order = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(order);
		//distinct elements 
		System.out.println("-----distincet elements--------");
		List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 4);
		numbers1.stream()
		.distinct()
		.forEach(System.out::println);
		
		
		System.out.println("-----reverse Order--------");
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		System.out.println("-----sum and average--------");
		
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println(average);
		
		System.out.println("-----length sorted--------");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream()
        .sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);

		System.out.println("-----Second highest--------");
		
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer num2 = listOfIntegers.stream()
        		.sorted(Comparator.reverseOrder())
        		.skip(1)
        		.findFirst()
        		.get();
        System.out.println(num2);
        
        
        System.out.println("-----Anagram--------");
        
        String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split(""))
        		.map(String::toUpperCase)
        		.sorted()
        		.collect(Collectors.joining());
        s2 = Stream.of(s2.split(""))
        		.map(String::toUpperCase)
        		.sorted()
        		.collect(Collectors.joining());
        
        if(s1.equals(s2)) {
        	System.out.println("okay");
        }else {
        	System.out.println("not Okay");
        }
        
        
        System.out.println("-----3 min and max--------");
        
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        List<Integer> list1 = listOfIntegers2.stream()
        		.sorted()
        		.limit(3)
        		.collect(Collectors.toList());
        System.out.print(list1);
        
        List<Integer> list2 = listOfIntegers2.stream()
        		.sorted(Comparator.reverseOrder())
        		.limit(3)
        		.collect(Collectors.toList());
        
        System.out.print(list2);
		
	}
}
