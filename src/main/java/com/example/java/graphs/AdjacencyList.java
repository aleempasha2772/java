package com.example.java.graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
        System.out.println("Adjacency List:");
        adjList.keySet().stream().sorted().forEach(vertex -> {
            System.out.println("  " + vertex + " -> " + adjList.get(vertex));
        });
        System.out.println();
    }

    public void depthFirstSearch(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> nodesVisited = new HashSet<>();

        stack.push(startVertex);
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            nodesVisited.add(currentVertex);

            for (int neighbor : adjList.getOrDefault(currentVertex, Collections.emptyList())) {
                if (!nodesVisited.contains(neighbor)) {
                    stack.push(neighbor);         // fixed: was nodesVisited.add(neighbor)
                    nodesVisited.add(neighbor);
                }
            }
        }
        System.out.println("DFS visited " + nodesVisited.size() + " nodes.");
        System.out.println("Order: " + String.join(" -> ",
                nodesVisited.stream().map(String::valueOf).toArray(String[]::new)));
        System.out.println();
    }

    public void breadthFirstSearch(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> nodesVisited = new HashSet<>();

        queue.add(startVertex);
        nodesVisited.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjList.getOrDefault(currentVertex, Collections.emptyList())) {
                if (!nodesVisited.contains(neighbor)) {
                    queue.add(neighbor);
                    nodesVisited.add(neighbor);
                }
            }
        }
        System.out.println("BFS visited " + nodesVisited.size() + " nodes.");
        System.out.println("Order: " + String.join(" -> ",
                nodesVisited.stream().map(String::valueOf).toArray(String[]::new)));
        System.out.println();
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);

        graph.display();

        graph.depthFirstSearch(0);
        graph.breadthFirstSearch(0);
    }
}