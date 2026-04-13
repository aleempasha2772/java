package com.example.java.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            count++;

            for (int next : graph.get(curr)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return count == numCourses;
    }

    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();

        // Test 1: Simple linear chain — 0 → 1 → 2, no cycle
        // To take 1, complete 0 first. To take 2, complete 1 first.
        int numCourses1 = 3;
        int[][] prerequisites1 = {{1, 0}, {2, 1}};
        System.out.println("Test 1 (expect true):  " + cs.canFinish(numCourses1, prerequisites1));

        // Test 2: Direct cycle — 1 requires 0, and 0 requires 1
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println("Test 2 (expect false): " + cs.canFinish(numCourses2, prerequisites2));

        // Test 3: No prerequisites at all — all courses are free
        int numCourses3 = 4;
        int[][] prerequisites3 = {};
        System.out.println("Test 3 (expect true):  " + cs.canFinish(numCourses3, prerequisites3));

        // Test 4: Indirect cycle — 0→1→2→0
        int numCourses4 = 3;
        int[][] prerequisites4 = {{1, 0}, {2, 1}, {0, 2}};
        System.out.println("Test 4 (expect false): " + cs.canFinish(numCourses4, prerequisites4));

        // Test 5: Multiple paths, no cycle — diamond shape
        //    0
        //   / \
        //  1   2
        //   \ /
        //    3
        int numCourses5 = 4;
        int[][] prerequisites5 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println("Test 5 (expect true):  " + cs.canFinish(numCourses5, prerequisites5));

        // Test 6: Single course, no prerequisites
        int numCourses6 = 1;
        int[][] prerequisites6 = {};
        System.out.println("Test 6 (expect true):  " + cs.canFinish(numCourses6, prerequisites6));
    }
}