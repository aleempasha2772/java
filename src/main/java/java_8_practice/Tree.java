package java_8_practice;

import com.example.java.data_structures.Tree.TreeNode;

public class Tree {
	
	private TreeNode root;
	public class TreeNode{
		private int data;
		TreeNode left;
		TreeNode right;
		
		private TreeNode(int data) {
			this.data = data;
		}
	}
	
	private void createTree() {
		TreeNode first = new TreeNode(9);
        TreeNode sec = new TreeNode(2);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(3);

        root = first;
        root.left = sec;
        root.right = three;
        sec.left = four;
	}
	
	
	public void PreOrder(TreeNode root) {
		if(root==null) {
			System.out.println("No elements in tree");
		}else {
			System.out.println(root.data);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	
	

}
