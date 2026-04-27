package com.example.java.graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordSet = new HashSet<>(wordList);
		if (wordSet.isEmpty()) { // Safer than == null since constructor throws NPE anyway
			return 0;
		}
		
		Queue<String> queue = new LinkedList<>();
		Set<String> nodesVisited = new HashSet<>();
		queue.add(beginWord);
		queue.add(null);
		nodesVisited.add(beginWord);
		
		int level = 1;
		
		while(!queue.isEmpty()) {
			String word = queue.poll();
			if(word == null) {
				level++;
				if(!queue.isEmpty()) {
					queue.add(null);
				}
				continue;
			}
			
			if(endWord.equals(word)) {
				return level;
			}
			
			for(int i=0; i<word.length(); i++) {
				char[] chars = word.toCharArray();
				// FIX: Changed c < 'z' to c <= 'z' so 'z' is actually tested
				for(char c = 'a'; c <= 'z'; c++) {
					if(c == word.charAt(i)) continue; // Skip unchanged character (minor optimization)
					chars[i] = c;
					String nextWord = new String(chars);
					if(wordSet.contains(nextWord) && !nodesVisited.contains(nextWord)){
						nodesVisited.add(nextWord);
						queue.offer(nextWord);
					}
				}
			}
		}
		
		return 0;
	}

	// ================= MAIN METHOD =================
	public static void main(String[] args) {
		WordLadder solution = new WordLadder();
		
		// Test 1: Standard LeetCode example
		String begin1 = "hit";
		String end1 = "cog";
		List<String> wordList1 = Arrays.asList("hot","dot","dog","lot","log","cog");
		int res1 = solution.ladderLength(begin1, end1, wordList1);
		System.out.println("Test 1 | Expected: 5 | Got: " + res1);
		
		// Test 2: endWord not in dictionary
		List<String> wordList2 = Arrays.asList("hot","dot","dog","lot","log");
		int res2 = solution.ladderLength(begin1, end1, wordList2);
		System.out.println("Test 2 | Expected: 0 | Got: " + res2);
		
		// Test 3: Single character change
		String begin3 = "a";
		String end3 = "c";
		List<String> wordList3 = Arrays.asList("a", "b", "c");
		int res3 = solution.ladderLength(begin3, end3, wordList3);
		System.out.println("Test 3 | Expected: 2 | Got: " + res3);
		
		// Test 4: No valid path
		String begin4 = "red";
		String end4 = "tax";
		List<String> wordList4 = Arrays.asList("ted","tex","red","tax","tad","den","rex","pee");
		int res4 = solution.ladderLength(begin4, end4, wordList4);
		System.out.println("Test 4 | Expected: 4 | Got: " + res4);
	}
}