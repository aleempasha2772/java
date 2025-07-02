package com.example.java.graphs;

import java.util.ArrayList;

public class Vertex {
	private String data;
	private ArrayList<Edge> edges;
	
	
	Vertex(String inputData){
		this.data = inputData;
		this.edges = new ArrayList<Edge>();
		
	}
}
