package com.example.java.graphs;

public class Edge {
	private Vertex start;
	private Vertex end;
	private Integer weight;
	
	
	Edge(Vertex startVertex,Vertex endVertex,Integer inputWeight){
		this.start = startVertex;
		this.end = endVertex;
		this.weight = inputWeight;
	}


	public Vertex getStart() {
		return start;
	}


	public void setStart(Vertex start) {
		this.start = start;
	}


	public Vertex getEnd() {
		return end;
	}


	public void setEnd(Vertex end) {
		this.end = end;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
	
}
