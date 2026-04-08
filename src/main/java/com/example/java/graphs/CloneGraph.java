package com.example.java.graphs;

import java.util.*;

// 1. Node1 Class
class Node1 {
    public int data;
    public List<Node1> neighbours;

    public Node1(int data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    // Helper for printing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node1[").append(data).append("] -> [");
        for (int i = 0; i < neighbours.size(); i++) {
            sb.append(neighbours.get(i).data);
            if (i < neighbours.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

// 2. Your CloneGraph class (with return type fix)
class CloneGraph {
    // Fixed: added return type 'Node1'
    private Node1 cloneUtil(Node1 Node1, Map<Node1, Node1> map) {
        Node1 newNode1 = new Node1(Node1.data);
        map.put(Node1, newNode1); 

        for (Node1 neighbour : Node1.neighbours) {
            if (!map.containsKey(neighbour)) {
                newNode1.neighbours.add(cloneUtil(neighbour, map));
            } else {
                newNode1.neighbours.add(map.get(neighbour));
            }
        }
        return newNode1;
    }

    public Node1 cloneGraph(Node1 Node1) {
        if (Node1 == null) return null;
        Map<Node1, Node1> map = new HashMap<>();
        return cloneUtil(Node1, map);
    }

    // 3. Main function to test
    public static void main(String[] args) {
        // Build a sample graph with a cycle: 1 <-> 2 <-> 3 <-> 4 <-> 1
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);

        n1.neighbours.addAll(Arrays.asList(n2, n4));
        n2.neighbours.addAll(Arrays.asList(n1, n3));
        n3.neighbours.addAll(Arrays.asList(n2, n4));
        n4.neighbours.addAll(Arrays.asList(n1, n3));

        CloneGraph solver = new CloneGraph();
        Node1 cloned = solver.cloneGraph(n1);

        System.out.println("=== ORIGINAL GRAPH ===");
        printGraphStructure(n1);
        
        System.out.println("\n=== CLONED GRAPH ===");
        printGraphStructure(cloned);

        System.out.println("\n=== VALIDATION ===");
        System.out.println("Different objects? " + (n1 != cloned));
        System.out.println("Same structure & data? " + isStructurallyEqual(n1, cloned));
    }

    // BFS printer to safely handle cycles
    private static void printGraphStructure(Node1 start) {
        if (start == null) return;
        Set<Integer> visited = new HashSet<>();
        Queue<Node1> q = new LinkedList<>();
        q.add(start);
        visited.add(start.data);

        while (!q.isEmpty()) {
            Node1 curr = q.poll();
            System.out.println(curr);
            for (Node1 nb : curr.neighbours) {
                if (!visited.contains(nb.data)) {
                    visited.add(nb.data);
                    q.add(nb);
                }
            }
        }
    }

    // Deep equality check that safely handles cycles
    private static boolean isStructurallyEqual(Node1 orig, Node1 clone) {
        if (orig == null && clone == null) return true;
        if (orig == null || clone == null) return false;
        
        Map<Node1, Node1> visited = new HashMap<>();
        return dfsCheck(orig, clone, visited);
    }

    private static boolean dfsCheck(Node1 o, Node1 c, Map<Node1, Node1> visited) {
        if (o.data != c.data || o.neighbours.size() != c.neighbours.size()) return false;
        if (visited.containsKey(o)) return visited.get(o) == c; // Cycle check

        visited.put(o, c);
        for (int i = 0; i < o.neighbours.size(); i++) {
            if (!dfsCheck(o.neighbours.get(i), c.neighbours.get(i), visited)) {
                return false;
            }
        }
        return true;
    }
}