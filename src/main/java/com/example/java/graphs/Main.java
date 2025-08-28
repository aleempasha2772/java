package com.example.java.graphs;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * initializing a graph
		 */
		
		/*
		 * for adjacency matrix 
		 */
		//Graph graph = new Graph(5);
		
		/*
		 * for adjacency List 
		 */
		Graph graph = new Graph();
		
		/*
		 * adding nodes to graph
		 */
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		/*
		 * adding edges between the nodes
		 */
		
		graph.addEdgeUndirectedGrapgh(0, 1);
		graph.addEdgeUndirectedGrapgh(1, 2);
		graph.addEdgeUndirectedGrapgh(1, 4);
		graph.addEdgeUndirectedGrapgh(2, 3);
		graph.addEdgeUndirectedGrapgh(2, 4);
		graph.addEdgeUndirectedGrapgh(4, 0);
		graph.addEdgeUndirectedGrapgh(4, 2);
		
		
		/*
		 * printing the Adjacency matrix
		 */
		graph.print();
		
        graph.depthFirstSearchIterative(0);

		
		
		
		
		
	}
}
