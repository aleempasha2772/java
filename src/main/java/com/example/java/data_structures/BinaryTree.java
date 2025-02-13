package com.example.java.data_structures;

import java.util.LinkedList;
import java.util.Queue;
/*
Do you have exp on multi threading, data structure, HashMap
Do you have exp in arrays, abstract, interface?
concurrencies and threads ?
How strong in SQL?

51246
 */

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode sec = new TreeNode(2);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(3);

        root = first;
        root.left = sec;
        root.right = three;
        sec.left = four;
    }

    public void PreOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public void InOrder(TreeNode root){
        if(root == null){
            return;
        }

        InOrder(root.left);
        System.out.print(root.data+ " ");
        InOrder(root.right);
    }

    public void PostOrder(TreeNode root){
        if(root == null){
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public void LevelOrder(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
        }
    }

    public int TreeHeight(TreeNode root){
    	
        if(root == null){
            //System.out.println("no tree");
            return -1;
        }
        
        int leftHeight = TreeHeight(root.left);
        int rightHeight = TreeHeight(root.right);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public void rightView(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+ " ");
        rightView(root.right);
    }



    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.CreateBinaryTree();

        System.out.println("Pre-Order Traverse");
        bt.PreOrder(bt.root);
        System.out.println();
        System.out.println("In-Order Traverse");
        bt.InOrder(bt.root);
        System.out.println();
        System.out.println("Post-Order Traverse");
        bt.PostOrder(bt.root);
        System.out.println();
        System.out.println("level-Order Traverse");
        bt.LevelOrder(bt.root);
        System.out.println();
        System.out.println("Height of the Tree");
        System.out.println(bt.TreeHeight(bt.root));
        System.out.println();
        System.out.println("Right view");
        bt.rightView(bt.root);

    }

}