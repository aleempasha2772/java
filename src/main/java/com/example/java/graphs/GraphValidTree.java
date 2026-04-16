package com.example.java.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphValidTree {
	
	public static boolean validTree(int n, int[][] edges) {
		// Optional optimization: A tree with n nodes must have exactly n-1 edges
		if (edges.length != n - 1) {
			return false;
		}

		List<List<Integer>> adjacencyList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adjacencyList.add(new ArrayList<>());
		}
		
		for (int[] edge : edges) {
			adjacencyList.get(edge[0]).add(edge[1]);
			adjacencyList.get(edge[1]).add(edge[0]);
		}
		
		Set<Integer> nodesVisited = new HashSet<>();
		// Using DFS to detect cycles and check connectivity
		if (!dfs(0, -1, adjacencyList, nodesVisited)) {
			return false;
		}
		
		return nodesVisited.size() == n;
	}
	
	public static boolean dfs(int node, int parent, List<List<Integer>> adj, Set<Integer> nodesVisited) {
		if (nodesVisited.contains(node)) {
			return false; // Cycle detected
		}
		nodesVisited.add(node);
		
		for (int neighbor : adj.get(node)) { 
			if (neighbor == parent) {
				continue;
			}
			if (!dfs(neighbor, node, adj, nodesVisited)) {
				return false;
			}
		}
		return true;
	}
	
	// Fixed: Changed 'parent' parameter to 'totalNodes' and corrected return condition
	public static boolean bfs(int startNode, int totalNodes, List<List<Integer>> adj, Set<Integer> nodesVisited) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {startNode, -1}); // {current, parent}
		nodesVisited.add(startNode);
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int currentNode = curr[0];
			int parentNode = curr[1]; 
			
			for (int neighbor : adj.get(currentNode)) {
				if (neighbor == parentNode) continue;
				if (nodesVisited.contains(neighbor)) {
					return false; // Cycle detected
				}
				nodesVisited.add(neighbor);
				queue.offer(new int[] {neighbor, currentNode});
			}
		}
		
		return nodesVisited.size() == totalNodes;
	}

	public static void main(String[] args) {
		// Test 1: Valid tree
		System.out.println("Test 1 (Valid Tree): " + validTree(5, new int[][]{{0,1}, {0,2}, {0,3}, {1,4}}));
		// Expected: true

		// Test 2: Contains a cycle
		System.out.println("Test 2 (Has Cycle): " + validTree(5, new int[][]{{0,1}, {1,2}, {2,3}, {1,3}, {1,4}}));
		// Expected: false

		// Test 3: Not fully connected (disconnected graph)
		System.out.println("Test 3 (Disconnected): " + validTree(5, new int[][]{{0,1}, {1,2}, {2,3}}));
		// Expected: false

		// Test 4: Single node (valid tree by definition)
		System.out.println("Test 4 (Single Node): " + validTree(1, new int[][]{}));
		// Expected: true

		// Test 5: Multiple nodes, no edges (disconnected)
		System.out.println("Test 5 (No Edges): " + validTree(3, new int[][]{}));
		// Expected: false
	}
}