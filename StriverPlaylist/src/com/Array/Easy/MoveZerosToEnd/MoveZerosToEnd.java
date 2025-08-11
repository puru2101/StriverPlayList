package com.Array.Easy.MoveZerosToEnd;

public class MoveZerosToEnd {

	static void moveZerosToEnd(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < arr.length) {
			arr[count] = 0;
			count++;
		}
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}

	static void moveZeroes(int[] nums) {
		int lastNonZeroFoundAt = -1;
		for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
			if (nums[currentIndex] != 0) {
				lastNonZeroFoundAt++;
				int temp = nums[lastNonZeroFoundAt];
				nums[lastNonZeroFoundAt] = nums[currentIndex];
				nums[currentIndex] = temp;
			}
		}
		for (int a : nums) {
			System.out.print(a + ",");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 1, 0, 1, 0, 9 };
		 moveZerosToEnd(arr);
	}

}
