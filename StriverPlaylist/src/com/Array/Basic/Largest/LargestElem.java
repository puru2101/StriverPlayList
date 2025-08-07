package com.Array.Basic.Largest;

public class LargestElem {

	static int LargestElement(int arr[]) {
		int max = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (max == 0 || arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 8, 9, 4, 3 };
		System.out.println("Largest Elem: " + LargestElement(arr));

	}

}
