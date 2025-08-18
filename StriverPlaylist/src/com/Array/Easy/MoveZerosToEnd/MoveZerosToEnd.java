package com.Array.Easy.MoveZerosToEnd;

public class MoveZerosToEnd {

	static void moveZerosToEnd(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int mid=0;
		while (mid <= end) {
			if (arr[mid] != 0 ) {
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
		int[] arr = { 0, 1, 1, 1, 0, 1, 2, 0, 0, 0,0,0,0,0,0,0,0 };
		moveZerosToEnd(arr);

	}

}
