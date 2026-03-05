package com.Array.Easy;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void twoSums(int arr[], int k) {
		int remainder = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			remainder = k - arr[i];

			if (set.contains(remainder)) {
				System.out.println("1st Number : " + arr[i] +
						" 2nd Number : " + remainder + " : " + k);
			}
			set.add(arr[i]);

		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 6, 5, 2 };
		twoSums(arr, 7);
	}

}
