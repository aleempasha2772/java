package com.example.java.data_structures;

public class TreeDiameter {
    public TreeNode root;
    public class TreeNode{
        private int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
        	this.data = data;
        	this.left = null;
            this.right = null;
        }
    }
    
    public void Insert() {
    	root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	root.left.left = new TreeNode(4);
    	root.left.right = new TreeNode(5);
    }
    public int TreeHeight(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	return 1 +Math.max(TreeHeight(root.left), TreeHeight(root.right));
    }
    
    public int Diameter(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int leftHeight = TreeHeight(root.left);
    	int rightHeight = TreeHeight(root.right);
    	int totalDiameter = leftHeight + rightHeight +1;
    	int leftDiameter = Diameter(root.left);
    	int rightDiameter = Diameter(root.right);
    	return Math.max(totalDiameter, Math.max(leftDiameter, rightDiameter));
    }
    
    public static void main(String[] args) {
    	TreeDiameter td = new TreeDiameter();
    	td.Insert();
    	//td.Diamiter(td.root);
    	System.out.print(td.Diameter(td.root));
    }
}
