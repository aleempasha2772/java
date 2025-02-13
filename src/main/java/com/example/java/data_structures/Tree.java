package com.example.java.data_structures;

public class Tree {
	private TreeNode root;
    private class TreeNode{
        private int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }
    
    public void createTree() {
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
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.data+ " ");
    	PreOrder(root.left);
    	PreOrder(root.right);
    }
    
    public void InOrder(TreeNode root) {
    	if(root==null) {
    		return;
    	}
    	InOrder(root.left);
    	System.out.print(root.data+" ");
    	InOrder(root.right);
    }
    
    public void PostOrder(TreeNode root) {
    	if(root == null) {
    		return;
    	}
    	PostOrder(root.left);
    	PostOrder(root.right);
    	System.out.print(root.data+" ");
    }
    
    public int TreeHeight(TreeNode root){
        if(root == null){
            System.out.println("no tree");
            return -1;
        }
        else{
            int leftHeight = 0;
            int rightHeight = 0;
            if(root.left != null){
                leftHeight = TreeHeight(root.left);
            }
            if (root.right != null){
                rightHeight = TreeHeight(root.right);
            }

            int max = Math.max(leftHeight, rightHeight);
            if (max == 1){
                return 0;
            }else{
                return max + 1;
            }


        }
    }

    public static void main(String[] args) {
    	Tree tree = new Tree();
    	tree.createTree();
    	
    	System.out.println("Pre-Order Traverse");
    	tree.PreOrder(tree.root);
    	System.out.println();
    	System.out.println("In-Order Traverse");
    	tree.InOrder(tree.root);
    	System.out.println();
    	System.out.println("Post-Order Traverse");
    	tree.PostOrder(tree.root);
    	System.out.println();
    	System.out.println("Tree Height");
    	System.out.print(tree.TreeHeight(tree.root));
    	
    }
}
