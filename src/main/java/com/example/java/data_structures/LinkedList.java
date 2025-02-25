package com.example.java.data_structures;

public class LinkedList {
    Node head;
    static class Node{
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data = data;
    		this.next = null;
    	}
    }
    
    public static LinkedList insert(LinkedList list,int data) {
    	Node newNode = new Node(data);
    	newNode.next = null;
    	
    	if(list.head == null) {
    		list.head = newNode;
    	}else {
    		Node current = list.head;
    		while(current.next!=null) {
    			current = current.next;
    		}
    		current.next = newNode;
    	}
    	return list;
    }
    
    public static void display(LinkedList list) {
    	Node current = list.head;
    	if(current == null) {
    		System.out.println("No linked list");
    	}else {
    		while(current!=null) {
    			System.out.print(current.data+" -> ");
    			current = current.next;
    		}
    	}
    }
    
    public static void delete(LinkedList list,int key){
        Node currentNode = list.head;
        Node prev= null;

        if (currentNode != null && currentNode.data == key){
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            // Return the updated List
            
        }

        while(currentNode!=null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode!= null){
            prev.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
        
    }
    
    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
    	
    	insert(list,1);
    	insert(list,2);
    	display(list);
    	delete(list,1);
    	display(list);
    }
    
    
    
}
