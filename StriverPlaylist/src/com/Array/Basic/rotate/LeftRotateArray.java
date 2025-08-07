package com.Array.Basic.rotate;

public class LeftRotateArray {

	static void leftrotateArray(int[] arr) {

		int n = arr.length;
		int firstElem = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = firstElem;
		for (int elem : arr) {
			System.out.print(elem + " ,");
		}
	}

	


	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		 leftrotateArray(arr);
	
	}

}
