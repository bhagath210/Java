package com.pioneercoders.DSarray;

public class LinkedListEx2 {
	Node head;
	Node last;

	public void add(int Data) { // method for add Data into LL
		Node node = new Node();
		node.Data = Data;
		node.nextNode = null;
		if (head == null) {
			head = node;
		} else {
			last = head;
			while (last.nextNode != null) {
				last = last.nextNode;
			}
			last.nextNode = node;
		}
	}
	public void display() { // method for displaying data in LL
		Node last = head;
		while(last.nextNode != null) {
			System.out.print("\t" + last.Data);
			last = last.nextNode;
		}
		System.out.print("\t" + last.Data);
		System.out.println(" ");
	}
	public int length() { // method for displaying the length of LL
		int count = 1;
		Node last = head;
		while(last.nextNode != null) {
			last = last.nextNode;
			count++;
		}
		int length = (count);
		return (length);
		//System.out.println("The length of the Linked List is: "+ count+1);
	}
	public void fromMiddle(int length) { // method for displaying data from middle of LL
		Node last = head;
		int a = 0;
		while(last.nextNode != null) {
			if(a>=(length/2)) {
				System.out.print("\t" + last.Data);
				
			}
			last = last.nextNode;
			a++;
		}
		System.out.print("\t"+ last.Data);
		System.out.println(" ");
	}
	public void uptoMiddle(int length) { // method for displaying data upto middle of LL
		Node last = head;
		int a = 0;
		while(last.nextNode != null) {
			if(a<(length/2)) {
				System.out.print("\t" + last.Data);
				
			}
			last = last.nextNode;
			a++;
		}
		System.out.println(" ");
	}
	
//	public void stackRemove() { // removing method LIFO
//		Node last = head;
//		Node lastBefore = head;
//		while((last.nextNode != null) &&(lastBefore.nextNode != null)) {
//			System.out.print("\t" + last.Data); //stackRemove()
//			lastBefore = lastBefore.nextNode;
//			last = last.nextNode;
//		}
//		System.out.println(" ");
//	}
	public void queueRemove() { // removing method FIFO
		Node last = head.nextNode;
		head=last; // every time assigning last to head
		while(last.nextNode != null) {
			System.out.print("\t" + last.Data); 
			last = last.nextNode;
		}
		System.out.print("\t" + last.Data);
		System.out.println(" ");
	}
}