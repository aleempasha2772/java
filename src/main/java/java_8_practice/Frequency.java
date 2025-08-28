package java_8_practice;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		String text = "Hello world! Hello everyone. This is a test. Hello again, world.";
		String[] words = text.split("\\W+");
		
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<words.length;i++) {
			String word = words[i].toLowerCase();
			
			if(!words[i].isEmpty()) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		System.out.print(map);
		
	}
}
