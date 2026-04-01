package com.example.java.graphs;

public class NumberOfIslands {
	
	public static int NoOfIsalnds(char[][] grid) {
		int count =0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == '1') {
					dfs(grid,i,j);
					count++;
				}
			}
		}
		
		return count;
	}
	
	private static void dfs(char[][] grid, int i,int j) {
		if(i<0|| i>= grid.length || j<0 || j>= grid[i].length || grid[i][j] == '0') {
			return;
		}
		
		grid[i][j] = '0';
		
		dfs(grid,i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
	}


    public static void main(String[] args) {
        System.out.println("=== Number of Islands Test Cases ===\n");

        // Test Case 1
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println("Test Case 1:");
        printGrid(grid1);
        System.out.println("Number of Islands: " + NumberOfIslands.NoOfIsalnds(deepCopy(grid1)));
        System.out.println("Expected: 1\n");

        // Test Case 2
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Test Case 2:");
        printGrid(grid2);
        System.out.println("Number of Islands: " + NumberOfIslands.NoOfIsalnds(deepCopy(grid2)));
        System.out.println("Expected: 3\n");

        // Test Case 3 - All water
        char[][] grid3 = {
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        System.out.println("Test Case 3 (All water):");
        printGrid(grid3);
        System.out.println("Number of Islands: " + NumberOfIslands.NoOfIsalnds(deepCopy(grid3)));
        System.out.println("Expected: 0\n");

        // Test Case 4 - All land
        char[][] grid4 = {
            {'1', '1', '1'},
            {'1', '1', '1'}
        };
        System.out.println("Test Case 4 (All land):");
        printGrid(grid4);
        System.out.println("Number of Islands: " + NumberOfIslands.NoOfIsalnds(deepCopy(grid4)));
        System.out.println("Expected: 1\n");

        // Test Case 5 - Single cell
        char[][] grid5 = {{'1'}};
        System.out.println("Test Case 5 (Single cell):");
        printGrid(grid5);
        System.out.println("Number of Islands: " + NumberOfIslands.NoOfIsalnds(deepCopy(grid5)));
        System.out.println("Expected: 1\n");
    }

    // Helper method to print grid
    private static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Helper method to deep copy grid (since DFS modifies the original)
    private static char[][] deepCopy(char[][] original) {
        if (original == null) return null;
        char[][] copy = new char[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    
	}
}