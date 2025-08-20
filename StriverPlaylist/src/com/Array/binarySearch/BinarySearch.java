package com.Array.binarySearch;

public class BinarySearch {

	public static Integer binarySearch(int arr[], int k) {

		int start = 0;
		int end = arr.length;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				end=mid-1;
			} else
				start = mid + 1;
			
		}
		return mid;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(binarySearch(arr, 2));

	}

}
