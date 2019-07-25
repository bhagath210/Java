package com.pioneercoders.DSarray;

class Node { // created class 'Node' 
	int Data;
	Node nextNode; // declared an object 'nextNode' with Node reference
}

public class LinkedListEx {
	public static void main(String args[]) { // main method
		LinkedListEx list = new LinkedListEx(); // creating object with Linked ListEx class
		list.insert(18); // insert 18 into list using insert method
		list.insert(48); // insert 48 into list using insert method
		list.insert(36); // insert 36 into list using insert method
		list.show(); // show the data from the list using show method
	}

	Node head; // declared an object 'head' with Node reference

	public void insert(int Data) { // insert method for inserting data into list
		Node node = new Node(); // created object 'node' 
		node.Data = Data; // assigning the argument to the Data variable
		node.nextNode = null; // initializing null to the nextNode variable 
		if (head == null) { // checking for condition is head is null or not 
			head = node; // if it is null assigning that node object to head object
		} else {
			Node NewNode; // creating object with Node reference 
			NewNode = head; // assigning head to NewNode 
			while (NewNode.nextNode != null) { // checking condition after executed the below statement once 
				NewNode = NewNode.nextNode; // null will be assigned to NewNode.nextNode
			}
			NewNode.nextNode = node; // assigning node to nextNode for every iteration
		}
	}

	public void show() {
		Node node = head;
		while (node.nextNode != null) {
			System.out.println(node.Data);
			node = node.nextNode;
		}
		System.out.println(node.Data);
	}
}