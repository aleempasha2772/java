package com.example.java.data_structures;

public class SortedToBST {
	private TreeNode root;
	public class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	public TreeNode construct(int[] arr,int left,int right) {
		if(left>right) {
			return null;
		}
		
		int mid = left + (right-left)/2;
		
		
		TreeNode node = new TreeNode(arr[mid]);
		node.left = construct(arr,left,mid-1);
		node.right = construct(arr,mid+1,right);
		return node;
		
	}
	
	public TreeNode constructBST(int[] arr) {
		if(arr == null|| arr.length == 0) {
			return null;
		}
		return construct(arr,0,arr.length-1);
	}
	
	public void InOrder(TreeNode root) {
		if (root==null) {
			return;
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	
	public static void main(String[] args) {
		SortedToBST bst =  new SortedToBST();
		int[] arr = {-10, -3, 0, 5, 9};
		TreeNode root = bst.constructBST(arr);
		bst.InOrder(root);
		
	}
	
	
	
}
