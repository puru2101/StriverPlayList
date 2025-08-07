package com.Array.Basic.rotate;

public class RotateArrayByKOptimize {

	public static void rightRotateByK(int arr[], int k) {
		int n = arr.length;
		rotate(arr, 0, n - 1);	
		rotate(arr, 0, k - 1);
		rotate(arr, k , n - 1);
		for (int number : arr) {
			System.out.print(number+",");
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
		rightRotateByK(arr, 2);
	}

}
