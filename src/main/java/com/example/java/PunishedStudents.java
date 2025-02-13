package com.example.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PunishedStudents {

    public static int punishedStudents(int N, int[] A, int[] B) {
        // Map to store the position of each student in the entry sequence A
        Map<Integer, Integer> entryMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            entryMap.put(A[i], i);
        }

        // Map to store the position of each student in the exit sequence B
        Map<Integer, Integer> exitMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            exitMap.put(B[i], i);
        }

        // Set to store punished students
        Set<Integer> punished = new HashSet<>();

        // Check for overtakes
        for (int i = 0; i < N; i++) {
            int student = B[i];
            int exitPos = i;
            int entryPos = entryMap.get(student);

            // Check if the student has overtaken any student behind them in the entry sequence
            for (int j = exitPos + 1; j < N; j++) {
                int nextStudent = B[j];
                if (entryMap.get(nextStudent) < entryPos) {
                    punished.add(student);
                    break;
                }
            }
        }

        return punished.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // Calculate and print the result
        int result = punishedStudents(N, A, B);
        System.out.println(result);

        scanner.close();
    }
}