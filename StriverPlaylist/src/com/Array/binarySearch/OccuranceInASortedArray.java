package com.Array.binarySearch;

public class OccuranceInASortedArray {

	public static int countOccurnace(int arr[], int k) {
		return last(arr, k) - first(arr, k) + 1;
	}

	public static int first(int arr[], int k) {
		int start = 0;
		int end = arr.length - 1;
		int first = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				first = mid;
				end = mid - 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return first;
	}

	public static int last(int arr[], int k) {
		int start = 0;
		int end = arr.length - 1;
		int last = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				last = mid;
				start = mid + 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return last;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 4, 4, 4, 4, 5 };
		System.out.println(countOccurnace(arr, 2));
	}

}
