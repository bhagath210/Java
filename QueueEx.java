package com.pioneercoders.DSarray;

@SuppressWarnings("serial")
class ArrayBoundCustomException extends Exception {
	ArrayBoundCustomException(String ExceptionMsg) {
		super(ExceptionMsg);
	}
}

public class QueueEx {
	int QueueArray[] = new int[3];
	int frontElement = 0;
	int rearElement = 0;

	public static void main(String args[]) {
		QueueEx Array = new QueueEx();
		try {
			Array.push(12);
			Array.push(16);
			Array.push(20);
			Array.push(24);
		} catch (ArrayBoundCustomException Exception) {
			System.out.println(Exception.getMessage());
			// Exception.printStackTrace();
		}
		try {
			Array.pop();
			Array.pop();
			Array.pop();
			Array.pop();
		} catch (ArrayBoundCustomException Exception) {
			System.out.println(Exception.getMessage());
			// Exception.printStackTrace();
		}

	}

	public void push(int a) throws ArrayBoundCustomException {
		if (frontElement >= QueueArray.length) {
			ArrayBoundCustomException E = new ArrayBoundCustomException("Stack Over Flow Exception");
			throw E;
		}
		QueueArray[frontElement] = a;
		frontElement++;
		System.out.println("The element pushed in array is: " + a);
		System.out.println("The Resultant Array elements are:");
		for (int i = 0; i < frontElement; i++) {
			System.out.println(QueueArray[i]);
		}
	}

	public void pop() throws ArrayBoundCustomException {
		if (rearElement == frontElement) {
			ArrayBoundCustomException E = new ArrayBoundCustomException("Stack Under Flow Exception");
			throw E;
		}
		int a = QueueArray[rearElement];
		rearElement++;
		System.out.println(a + " is popped form the Array");
		System.out.println("The resultant Array elements are:");

		for (int i = rearElement; i < frontElement; i++) {
			System.out.println(QueueArray[i]);
		}

	}
}