package com.example.java.graphs;

import java.util.ArrayList;
import java.util.List;

class GraphEdge {
    private int source;
    private int destination;
    private int weight;

    public GraphEdge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() { return source; }
    public int getDestination() { return destination; }
    public int getWeight() { return weight; }
}

public class WeightedGraph {

    private int vertices;
    private List<GraphEdge>[] adjList;

    @SuppressWarnings("unchecked")
    public WeightedGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addDirectedEdge(int source, int destination, int weight) {
        adjList[source].add(new GraphEdge(source, destination, weight));
    }

    public void addUndirectedEdge(int source, int destination, int weight) {
        adjList[source].add(new GraphEdge(source, destination, weight));
        adjList[destination].add(new GraphEdge(destination, source, weight));
    }

    public List<GraphEdge>[] getAdjList() {
        return adjList;
    }

    public void display() {
        System.out.println("Weighted Graph Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("  " + i + " -> ");
            for (GraphEdge edge : adjList[i]) {
                System.out.print("[" + edge.getDestination() + ", w=" + edge.getWeight() + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- Undirected Weighted Graph ---");
        WeightedGraph undirected = new WeightedGraph(5);
        undirected.addUndirectedEdge(0, 1, 10);
        undirected.addUndirectedEdge(0, 4, 20);
        undirected.addUndirectedEdge(1, 2, 30);
        undirected.addUndirectedEdge(2, 3, 40);
        undirected.addUndirectedEdge(3, 4, 50);
        undirected.display();

        System.out.println("--- Directed Weighted Graph ---");
        WeightedGraph directed = new WeightedGraph(4);
        directed.addDirectedEdge(0, 1, 5);
        directed.addDirectedEdge(0, 2, 15);
        directed.addDirectedEdge(1, 3, 25);
        directed.addDirectedEdge(2, 3, 35);
        directed.display();
    }
}