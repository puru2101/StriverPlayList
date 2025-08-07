package com.Array.Basic.rotate;

public class LeftArrayByKOptimize {

	public static void leftRotateByK(int arr[], int k) {
		int n = arr.length;
		rotate(arr, 0, n - 1);
		rotate(arr, n - k, n - 1);
		rotate(arr, 0, n - k - 1);
		for (int number : arr) {
			System.out.print(number + ",");
		}
	}

	static void rotate(int arr[], int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		leftRotateByK(arr, 2);
	}

}
