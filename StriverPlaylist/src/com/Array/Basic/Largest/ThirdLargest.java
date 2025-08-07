package com.Array.Basic.Largest;

public class ThirdLargest {
	static int ThirdLargestElem(int arr[]) {
		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if (arr[i] > thirdMax && secondMax < max && thirdMax < secondMax) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];

			}
			if (arr[i] > secondMax && secondMax < max) {
				secondMax = max;
				max = arr[i];

			}
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		return thirdMax;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 8, 9, 4, 3 };
		System.out.println("Third Largest Elem: " + ThirdLargestElem(arr));

	}

}
