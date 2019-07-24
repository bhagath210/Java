package com.pioneercoders.DSarray;

class ArrayBoundCustomException extends Exception {
	ArrayBoundCustomException(String ExceptionMsg) {
		super(ExceptionMsg);
	}
}

public class StackArrayEx {
	int Stack[] = new int[4];
	int currentposition = 0;

	public static void main(String args[]) {
		StackArrayEx Array = new StackArrayEx();
		try {
			Array.push(5); // 1st element in array
			Array.pop(); // no elements in array
			Array.push(10); // Stack[]={10}
			Array.push(15); // Stack[]={10,15}
			Array.push(20); // Stack[]={10,15,20}
			Array.pop(); // Stack[]={10,15}
			Array.push(25); // Stack[]={10,15,25}
			Array.push(30); // Stack[]={10,15,25,30}
			Array.push(35); // we get exception here
		} catch (ArrayBoundCustomException Exception) {
			System.out.println(Exception.getMessage());
			//Exception.printStackTrace();
		}
		try {
			Array.pop();
			Array.pop();
			Array.pop();
			Array.pop();
//			Array.pop();
			Array.push(35);
		} catch (ArrayBoundCustomException Exception) {
			System.out.println(Exception.getMessage());
			//Exception.printStackTrace();
		}
	}

	public void push(int a) throws ArrayBoundCustomException {
		if (currentposition >= Stack.length) {
			ArrayBoundCustomException E = new ArrayBoundCustomException("Stack Over Flow Exception");
			throw E;
		}
		Stack[currentposition] = a;
		currentposition++;
		System.out.println("The element pushed in array is: " + a);
		
		System.out.println("The Resultatnt Stack Array is ");
		for (int i = 0; i < currentposition; i++) {
			System.out.println(Stack[i]);
		}
		
	}

	public void pop() throws ArrayBoundCustomException {
		if (currentposition == 0) {
			ArrayBoundCustomException E = new ArrayBoundCustomException("Stack Under Flow Exception");
			throw E;
		}
		currentposition--;
		System.out.println("The element popped is: " + Stack[currentposition]);
		System.out.println("The Stack Array is: ");
		for (int i = 0; i < currentposition; i++) {
			System.out.println(Stack[i]);
		}

	}
}