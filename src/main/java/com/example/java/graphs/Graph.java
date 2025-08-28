package com.example.java.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	
	
	/*
	 * Adjacency Matrix implementation
	
	ArrayList<Node> nodes;
	ArrayList<LinkedList<Node>> adjacencyList; 
	int[][] matrix;
	
	Graph(int size){
		nodes = new ArrayList<>();
		matrix  = new int[size][size];
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	public void addEdge(int source,int destination) {
		matrix[source][destination] = 1;
	}
	public boolean checkEdge(int source,int destination) {
		if(matrix[source][destination] == 1) {
			return true;
		}
		return false;
	}
	
	public void print() {
		
		System.out.print("  ");
		for(Node node:nodes) {
			System.out.print(node.data +" ");
		}
		System.out.println();
		
		for(int i=0;i<matrix.length;i++) {
			System.out.print(nodes.get(i).data + " ");
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	 * 
	 * 
	*/
	
	
	ArrayList<LinkedList<Node>> adjacencyList;
	
	Graph(){
		adjacencyList = new ArrayList<>();
	}
	
	public void addNode(Node node) {
		LinkedList<Node> currentList = new LinkedList<>();
		currentList.add(node);
		adjacencyList.add(currentList);
	}
	public void addEdgeUndirectedGrapgh(int source,int destination) {
		addEdge(source,destination);
		addEdge(destination,source);
	}
	
	public void addEdge(int source,int destination) {
		LinkedList<Node> currentList = adjacencyList.get(source);
		Node dest = adjacencyList.get(destination).get(0);
		currentList.add(dest);
	}
	
	public boolean checkEdge(int source, int destination) {
		LinkedList<Node> currentList = adjacencyList.get(source);
		Node dest = adjacencyList.get(destination).get(0);
		
		for(Node node :currentList) {
			if(node == dest) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for(LinkedList<Node> currentList : adjacencyList) {
			for(Node node: currentList) {
				System.out.print(node.data+ "-> ");
			}
			System.out.println();
		}
	}
	 private int findNodeIndex(Node node) {
	        for (int i = 0; i < adjacencyList.size(); i++) {
	            // First element in each linked list is the node itself
	            if (adjacencyList.get(i).get(0) == node) {
	                return i;
	            }
	        }
	        return -1; // Not found
	    }
	
	public void depthFirstSearchIterative(int start) {
		if(start<0 || start >= adjacencyList.size()) {
			return;
		}
		boolean[] visited = new boolean[adjacencyList.size()];
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Iterative BFS");
		
		visited[start] = true;
		stack.push(start);
		while(!stack.isEmpty()) {
			int currentIndex = stack.pop();
			Node currentNode = adjacencyList.get(currentIndex).get(0);
			System.out.print(currentNode.data+ " ");
			LinkedList<Node> neightbours = adjacencyList.get(currentIndex);
			
			for (int i = neightbours.size() - 1; i >= 1; i--) {
				Node neighbour = neightbours.get(i);
				int neighborIndex = findNodeIndex(neighbour);
                
                if (neighborIndex != -1 && !visited[neighborIndex]) {
                    visited[neighborIndex] = true;
                    stack.push(neighborIndex);
				
			}
			
		}
			  System.out.println();
	}
	
	}
	
}
