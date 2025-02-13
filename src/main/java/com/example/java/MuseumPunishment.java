package com.example.java;

import java.util.*;

public class MuseumPunishment {
    public static void punishedStudents() {
        Scanner sc = new Scanner(System.in);

        // Read the number of students
        System.out.println("Enter the total number of students");
        int N = sc.nextInt();
        System.out.println("Enter the students entered order ");
        int[] A = new int[N];
        System.out.println("Enter the students exit order ");
        int[] B = new int[N];

        // Read entry order
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Read exit order
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // Store entry indices
        Map<Integer, Integer> entryIndex = new HashMap<>();
        for (int i = 0; i < N; i++) {
            entryIndex.put(A[i], i);
        }

        // Count punished students
        int punishedCount = 0;
        Set<Integer> seen = new HashSet<>();

        for (int student : B) {
            int entryPos = entryIndex.get(student);

            // Check if any previously exited student entered later
            for (int seenStudent : seen) {
                if (entryIndex.get(seenStudent) < entryPos) {
                    punishedCount++;
                    break; // Punish each student only once
                }
            }
            seen.add(student);
        }

        // Print the output
        System.out.println(punishedCount);

        sc.close();
    }

    public static void main(String[] args) {
        punishedStudents();
    }
}
