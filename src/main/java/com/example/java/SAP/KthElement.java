package com.example.java.SAP;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class KthElement {               // class name now matches the constructor used in main
    private int count;                  // shared counter across recursive calls
    private int ans;                    // stores the final k-th largest value

    // Returns the k-th largest element in the BST
    public int kthLargest(Node root, int k) {
        count = 0;
        ans = -1;
        reverseInOrder(root, k);
        return ans;
    }

    // Reverse in-order traversal (right → node → left)
    private void reverseInOrder(Node root, int k) {
        if (root == null || count >= k) return;   // stop if tree ends or we already found the k-th

        reverseInOrder(root.right, k);            // go to larger elements first

        if (count < k) {                          // if we still need more elements
            ans = root.data;                      // current node is candidate for k-th largest
            count++;                              // one more largest element counted
        }

        reverseInOrder(root.left, k);             // then go to smaller elements
    }
    
    public int kthSmallest(Node root, int k) {
		count = 0;
		ans = -1;
		inOrder(root, k);
		return ans;
	}
    
    private void inOrder(Node root, int k) {
    	if (root == null || count >= k) {
    		return;
    	}
    	inOrder(root.left,k);
    	if(count < k) {
    		ans = root.data;
    		count++;
    	}
    	inOrder(root.right,k);
    	
    }

    public static void main(String[] args) {
        // Build the BST:
        //       4
        //     /   \
        //    2     9
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(9);

        KthElement solver = new KthElement();

        // ----- Test kthLargest -----
        int k = 2;
        int result = solver.kthLargest(root, k);
        System.out.println("Kth largest (k=" + k + ") is: " + result);   // Output: 4

        k = 1;
        result = solver.kthLargest(root, k);
        System.out.println("Kth largest (k=" + k + ") is: " + result);   // Output: 9

        k = 3;
        result = solver.kthLargest(root, k);
        System.out.println("Kth largest (k=" + k + ") is: " + result);   // Output: 2

        // ----- Test kthSmallest -----
        k = 1;
        result = solver.kthSmallest(root, k);
        System.out.println("Kth smallest (k=" + k + ") is: " + result);   // Output: 2

        k = 2;
        result = solver.kthSmallest(root, k);
        System.out.println("Kth smallest (k=" + k + ") is: " + result);   // Output: 4

        k = 3;
        result = solver.kthSmallest(root, k);
        System.out.println("Kth smallest (k=" + k + ") is: " + result);   // Output: 9
    }
}