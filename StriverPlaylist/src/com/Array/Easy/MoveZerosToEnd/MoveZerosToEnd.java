package com.Array.Easy.MoveZerosToEnd;

public class MoveZerosToEnd {

	static void moveZerosToEnd(int arr[]) {
		int start = 0;
		int mid = 0;
		while (mid <= arr.length - 1) {
			if (arr[mid] != 0) {
				int temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				mid++;
				start++;
			} else
				mid++;

		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 1, 0, 1,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,1};
		moveZerosToEnd(arr);

	}

}
