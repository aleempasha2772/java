package com.example.java.blind_75_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class valid_Paranthesis {
	
	
	
	public static boolean isValid(String str) {
		if(str.length() == 0|| str == null) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		Map<Character,Character> map = new HashMap<>();
		
		map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
		
		for(Character c: str.toCharArray()) {
			if(map.containsKey(c)) {
				if(!stack.isEmpty() && stack.peek() == map.get(c)) {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
 		
		return stack.isEmpty();
		
	}
	
	
	public static void main(String[] args) {
		String str = "([{}])";
		System.out.print(isValid(str));
	}

}
