package com.Array.binarySearch;

public class InsertAnElement {

	public static void insertElement(int arr[], int k) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] >= k) {
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			}
		}
		System.out.println("element should be inserted in :" + start + " position");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 5, 7 };
		int k = 4;
		insertElement(arr, k);
	}

}
