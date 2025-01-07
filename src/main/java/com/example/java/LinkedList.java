package com.example.java;



public class LinkedList {
	
	Node Head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.Head == null) {
			list.Head = newNode;
		}else {
			Node current = list.Head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return list;
	}
	
	
	public static void display(LinkedList list) {
		if(list.Head == null) {
			System.out.println("Nothing to display");
		}else {
			Node current = list.Head;
			while(current!=null) {
				System.out.print(current.data+" -> ");
				current = current.next;
			}
		}
	}
	
	
	public static LinkedList reverse(LinkedList list) {
		
		Node prev = null;
		Node current = list.Head;
		Node nextNode = null;
		
		while(current!=null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current= nextNode;
		}
		list.Head = prev;
		
		return list;
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        // ******INSERTION******


        // Insert the values
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        // Print the LinkedList
        display(list);
        //reverse
        reverse(list);
        System.out.println("After reverse"); 
        display(list);
	}
	


}
