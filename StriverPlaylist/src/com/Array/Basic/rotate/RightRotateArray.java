package com.Array.Basic.rotate;

public class RightRotateArray {
	

	static void rightArray(int[] arr) {
		int n = arr.length;
		int lastElem = arr[n - 1];
		for (int j = n - 1; j > 0; j--) {
			arr[j] = arr[j - 1];
		}
		arr[0] = lastElem;
		for (int elem : arr) {
			System.out.print(elem + " ,");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rightArray(arr);

	}

}
