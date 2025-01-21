package com.example.java.Patterns;

public class SquareStarPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
