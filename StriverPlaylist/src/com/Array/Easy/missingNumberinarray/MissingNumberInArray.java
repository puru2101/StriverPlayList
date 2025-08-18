package com.Array.Easy.missingNumberinarray;

public class MissingNumberInArray {

	public static Integer findNumber(int arr[]) {
		int missingNumber = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (i + 1 != arr[i]) {
				return i + 1;
			}
		}
		return missingNumber;
	}

	public static Integer findNumberUsingSum(int arr[]) {
		int actualSum = 0;
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		for (int a : arr) {
			actualSum += a;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
		int arr2[] = { 2, 3, 5, 6, 7, 8, 1 };
		System.out.println(findNumber(arr));
		System.out.println(findNumberUsingSum(arr2));
	}

}
