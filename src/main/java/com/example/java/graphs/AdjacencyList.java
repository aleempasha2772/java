package com.example.java.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
    private Map<Integer, List<Integer>> adjList;

    public AdjacencyList() {
        this.adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new LinkedList<>());
    }

    public void removeVertex(int vertex) {
        if (!adjList.containsKey(vertex)) return;

        // 1. Remove the vertex itself
        adjList.remove(vertex);

        // 2. Remove all references to this vertex from other adjacency lists
        for (List<Integer> neighbors : adjList.values()) {
            // ⚠️ CRITICAL FIX: Use Integer.valueOf() to force remove(Object) instead of remove(int index)
            neighbors.remove(Integer.valueOf(vertex));
        }
    }

    public void addEdge(int source, int destination) {
        // Auto-create vertices if they don't exist (prevents NullPointerException)
        addVertex(source);
        addVertex(destination);

        // Prevent duplicate edges in undirected graph
        if (!adjList.get(source).contains(destination)) {
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjList.containsKey(source) && adjList.containsKey(destination)) {
            adjList.get(source).remove(Integer.valueOf(destination));
            adjList.get(destination).remove(Integer.valueOf(source));
        }
    }

    // Helper to visualize the graph
    public void display() {
        System.out.println("📊 Adjacency List:");
        adjList.keySet().stream().sorted().forEach(vertex -> {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        });
        System.out.println();
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();

        // 1. Add vertices & edges
        System.out.println("✅ Adding vertices & edges...");
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.display();

        // 2. Remove an edge
        System.out.println("✅ Removing edge (0, 2)...");
        graph.removeEdge(0, 2);
        graph.display();

        // 3. Remove a vertex (removes it + all incident edges)
        System.out.println("✅ Removing vertex 1...");
        graph.removeVertex(1);
        graph.display();

        // 4. Add edge to non-existent vertex (auto-creates it)
        System.out.println("✅ Adding edge (0, 4) where 4 didn't exist...");
        graph.addEdge(0, 4);
        graph.display();
    }
}