package com.example.java.graphs;

public class AdjacencyMatrix {

    private int adjMatrix[][];
    private int numVertices;

    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1; // Undirected graph
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0; // Fixed: was duplicating adjMatrix[i][j] = 0
    }

    public void addVertex() {
        int[][] newAdjMatrix = new int[numVertices + 1][numVertices + 1];
        for (int i = 0; i < numVertices; i++) {
            System.arraycopy(adjMatrix[i], 0, newAdjMatrix[i], 0, numVertices);
        }
        adjMatrix = newAdjMatrix;
        numVertices++;
    }

    public void removeVertex(int v) {
        if (v < 0 || v >= numVertices) return; // Safety check

        int[][] newAdjMatrix = new int[numVertices - 1][numVertices - 1];
        int newRow = 0;
        for (int i = 0; i < numVertices; i++) {
            if (i == v) continue; // Skip the row to remove
            int newCol = 0;
            for (int j = 0; j < numVertices; j++) {
                if (j == v) continue; // Skip the column to remove
                newAdjMatrix[newRow][newCol] = adjMatrix[i][j];
                newCol++;
            }
            newRow++;
        }
        adjMatrix = newAdjMatrix;
        numVertices--;
    }

    // Helper to visualize the matrix
    public void display() {
        System.out.println("   " + java.util.stream.IntStream.range(0, numVertices)
                .mapToObj(i -> String.format("%2d", i)).reduce("", (a, b) -> a + b));
        for (int i = 0; i < numVertices; i++) {
            System.out.printf("%d: ", i);
            for (int j = 0; j < numVertices; j++) {
                System.out.printf("%2d ", adjMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        // 1. Initialize graph with 3 vertices (0, 1, 2)
        AdjacencyMatrix graph = new AdjacencyMatrix(3);
        System.out.println("✅ Created graph with 3 vertices");
        graph.display();

        // 2. Add edges: 0-1, 1-2, 0-2 (forms a triangle)
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        System.out.println("✅ Added edges: (0,1), (1,2), (0,2)");
        graph.display();

        // 3. Remove an edge
        graph.removeEdge(0, 2);
        System.out.println("✅ Removed edge: (0,2)");
        graph.display();

        // 4. Dynamically add a vertex (new index: 3)
        graph.addVertex();
        graph.addEdge(2, 3); // Connect new vertex to 2
        System.out.println("✅ Added vertex 3 and edge (2,3)");
        graph.display();

        // 5. Remove a vertex (index 1)
        graph.removeVertex(1);
        System.out.println("✅ Removed vertex 1 (graph re-indexed: old 2→1, old 3→2)");
        graph.display();
    }
}