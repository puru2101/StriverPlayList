package com.Array.Basic.ifSorted;

public class IfSorted {

	public static void ifSortedInc(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = false;
			}

		}
		if (!flag)
			System.out.println("Not Sorted");
		else
			System.out.println("sorted array");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 0 };
		ifSortedInc(arr);
	}

}
