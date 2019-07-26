package com.pioneercoders.DSarray;

public class LinkedListMainMethodEx {
	public static void main(String args[]) {
		LinkedListEx list = new LinkedListEx();
//		list.insert(18); // used in another class
//		list.insert(48); // used in another class
//		list.insert(36); // used in another class
//		list.show(); // used in another class
		LinkedListEx2 list2 = new LinkedListEx2();
		list2.add(20);
		list2.add(25);
		list2.add(30);
//		list2.display(); // if you want you can call 
		list2.add(35);
		list2.add(40);
		list2.add(45);
		list2.add(50);
		
		System.out.println("The Data in the LinkedListEx2 is: ");
		list2.display();
		System.out.println(" ");
		
		int length = list2.length();
		System.out.println("The length of the LinkedListEx2 is: " + length);
		System.out.println(" ");
		
		System.out.println("The Data from Middle of LinkedListEx2");
		list2.fromMiddle(length);
		System.out.println(" ");
		
		System.out.println("The Data upto Middle of LinkedListEx2");
		list2.uptoMiddle(length);
		System.out.println(" ");
		
		System.out.println("After Remove from Last Input Data using  Stack:");
		list2.stackRemove();
		System.out.println(" ");
		
		System.out.println("After 2nd Remove from Data using  Stack:");
		list2.stackRemove();
		System.out.println(" ");
		
		System.out.println("After Remove from  First Input Data using  Queue:");
		list2.queueRemove();
		System.out.println(" ");
		
		System.out.println("After 2nd Remove from Data using  Queue:");
		list2.queueRemove();
	}
}