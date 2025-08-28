package java_8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("a", "bb", "ccc", "dd");
		Map<Integer,List<String>> map = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.print(map);
	}
}
