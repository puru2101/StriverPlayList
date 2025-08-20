package com.Array.binarySearch;

public class UpperBound {
	public static Integer findUpperBound(int arr[], int k) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		int index = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] > k) {
				index = mid;
				//start = mid + 1;
				end = mid - 1;
			} else
				start = mid + 1;

		}
		return index;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8 };
		System.out.println(findUpperBound(arr, 6));
	}

}
