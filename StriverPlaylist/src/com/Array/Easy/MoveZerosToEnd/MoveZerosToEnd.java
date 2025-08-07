package com.Array.Easy.MoveZerosToEnd;

public class MoveZerosToEnd {

	static void moveZerosToEnd(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] == 0&& arr[end]!=0) {
				int temp = arr[start];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
			}else
				start++;

			for (int a : arr) {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 1, 0, 1, 2, 0, 0, 0 };
		moveZerosToEnd(arr);

	}

}
