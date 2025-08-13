package com.Array.Easy.maxSubArraySum;

import java.util.Arrays;

public class MaxSubArraySum {

	static void maxSubArray(int[] arr) {
		int temp = 0;
		int max = 0;
		int start = 0;
		int end = 0;
		int n = arr.length - 1;
		for (int i = 0; i < n; i++) {
			temp += arr[i];
			if (max < temp) {
				max = temp;
				end = i;
			}
			if (temp < 0) {
				temp = 0;
				start = i+1;
			}
		}

		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println("Max Sum is :" + max);

	}

	public static void main(String[] args) {
		int[] arr = { 2, -6, 8, -4, 5, -1, 3, -5, 4 };
		maxSubArray(arr);

	}

}
