package com.example.java;

public class Matrix {
	
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int value = 1;
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				matrix[i][j] = value++;
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

}
