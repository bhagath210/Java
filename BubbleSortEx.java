package com.pioneercoders.DSarray;

public class BubbleSortEx {
	public static void main(String args[]) {
		int Array[] = { 10, 8, 25, 18, 12, 45 };
		System.out.println("The array after sorting in accending order is:");
		for (int j = 0; j < Array.length; j++) {
			for (int i = 0; i < Array.length-1; i++) {
				if (Array[i] > Array[i + 1]) {
					int temp = Array[i];
					Array[i] = Array[i + 1];
					Array[i + 1] = temp;
				}
			}
			System.out.print(Array[j]+" ");
			System.out.println(" ");
		}
	System.out.println("The array after sorting in descending order is:");
	for(int k = Array.length-1; k > 0; k--) {
		System.out.print(Array[k]+" ");
	}
	}
}