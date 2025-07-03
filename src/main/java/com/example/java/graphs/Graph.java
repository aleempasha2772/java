package com.example.java.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

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
		LinkedList<Node> currentList = adjacencyList.get(source);
		Node dest = adjacencyList.get(destination).get(0);
		currentList.add(dest);
		LinkedList<Node> currentList2 = adjacencyList.get(destination);
		Node dest2 = adjacencyList.get(source).get(0);
		currentList2.add(dest2);
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
	
}
