package com.example.java.data_structures;

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode {
    	int data;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int data) {
    		this.data = data;
    	}
    }
    
    public BinarySearchTree() {
    	root = null;
    }
    
    public TreeNode BSTInsert(TreeNode current,int node) {
    	if(current== null) {
    		return new TreeNode(node);
    	}
    	if(node <current.data) {
    		 current.left =  BSTInsert(current.left,node);
    	}else if(node>current.data) {
    		current.right =  BSTInsert(current.right,node);
    	}
    	
		return current;
    }
    
    public void insert(int node) {
    	root = BSTInsert(root,node);
    }
    
    public void InOrder() {
    	InOrderTraversal(root);
    	System.out.println();
    }
    
    public void InOrderTraversal(TreeNode node) {
    	if(node == null) {
    		return;
    	}
    	InOrderTraversal(node.left);
    	System.out.print(node.data+" ");
    	InOrderTraversal(node.right);
    }
    
    public TreeNode BSTSearch(TreeNode node,int key) {
    	if(node == null|| node.data == key) {
    		return node;
    	}
    	if(key < node.data) {
    		return BSTSearch(node.left,key);
    	}else {
    		return BSTSearch(node.right,key);
    	}
    	
    	
    }
    
    
    private boolean search(int node) {
    	return BSTSearch(root,node) !=null;
    }
    
    
    
    public static void main(String[] args) {
    	BinarySearchTree bst = new BinarySearchTree();
    	
    	bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        System.out.println("In-order Traversal:");
        bst.InOrder();
        int keyToSearch = 70;
        if (bst.search(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the BST.");
        }
    }
    
    
    
    
    
}
