package com.Array.medium.maxProdSubArray;

public class MaxProSubArray {

	public static void maxProdSubArray(int[] arr) {

		int temp = 0;
		int prefixProd = 1;
		int suffixProd = 1;
		for (int i = 0; i < arr.length - 1; i++) {

			if (prefixProd == 0)
				prefixProd = 1;
			if (suffixProd == 0)
				suffixProd = 1;

			prefixProd *= arr[i];
			suffixProd *= arr[arr.length - i - 1];

			temp = Math.max(temp, Math.max(suffixProd, prefixProd));
					

		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, -5, 8, 9, 4, 0, 2, 4, 6, -12 };
		maxProdSubArray(arr);
	}
}
