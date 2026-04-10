package com.example.java.graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
        adjList.remove(vertex);
        for (List<Integer> neighbors : adjList.values()) {
            neighbors.remove(Integer.valueOf(vertex));
        }
    }

    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
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

    public void display() {
        System.out.println("📊 Adjacency List:");
        adjList.keySet().stream().sorted().forEach(vertex -> {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        });
        System.out.println();
    }
    
    public void breadthFirstSearch(int startVertex) {
        if (!adjList.containsKey(startVertex)) {
            System.out.println("⚠️ Vertex " + startVertex + " does not exist in graph.");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> nodesVisited = new HashSet<>();
        
        queue.add(startVertex);
        nodesVisited.add(startVertex);
        
        int level = 0;
        System.out.println("🔍 BFS Traversal Order:");
        System.out.println("   Level " + level + ": [" + startVertex + "]");
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevelNodes = new LinkedList<>();
            
            for (int i = 0; i < levelSize; i++) {
                int currentVertex = queue.poll();
                currentLevelNodes.add(currentVertex);
                
                for (int neighbor : adjList.getOrDefault(currentVertex, Collections.emptyList())) {
                    if (!nodesVisited.contains(neighbor)) {
                        queue.add(neighbor);
                        nodesVisited.add(neighbor);
                    }
                }
            }
            
            if (!queue.isEmpty()) {
                level++;
                System.out.println("   Level " + level + ": " + queue);
            }
        }
        
        System.out.println("✅ BFS Complete. Visited " + nodesVisited.size() + " nodes.");
        System.out.println("   Order: " + String.join(" → ", 
            nodesVisited.stream().map(String::valueOf).toArray(String[]::new)));
        System.out.println();
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();

        System.out.println("=== 🧪 GRAPH BFS DEMO ===\n");
        
        System.out.println("✅ Adding vertices & edges...");
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.display();
        
        System.out.println("🔍 Running BFS starting from vertex 0:");
        System.out.println("----------------------------------------");
        graph.breadthFirstSearch(0);
        System.out.println("----------------------------------------\n");

        System.out.println("✅ Removing edge (0, 2)...");
        graph.removeEdge(0, 2);
        graph.display();

        System.out.println("✅ Removing vertex 1...");
        graph.removeVertex(1);
        graph.display();

        System.out.println("✅ Adding edge (0, 4) where 4 didn't exist...");
        graph.addEdge(0, 4);
        graph.display();
        
        System.out.println("🔍 Running BFS again from vertex 0:");
        System.out.println("----------------------------------------");
        graph.breadthFirstSearch(0);
        System.out.println("----------------------------------------");
    }
}