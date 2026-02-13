package com.Array.binarySearch;

public class FloorAndCeling {

	public static void floor(int arr[], int k) {
		int start = 0;
		int end = arr.length - 1;
		int floor = -1;

		while (start <= end) {
            int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				floor = arr[mid];
				break;
			} else if (arr[mid] < k) {
				floor = arr[mid];
				start = mid + 1;
			} else
				end = mid - 1;
		}
		System.out.println("Floor of " + k + " in given array" + "is : " + floor);
	}

	public static void ceiling(int arr[], int k) {
		int start = 0;
		int end = arr.length - 1;
		int ceiling = -1;

		while (start <= end) {
            int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				ceiling = arr[mid];
				break;
			} else if (arr[mid] < k) {
				start = mid + 1;
			} else {
				ceiling = arr[mid];
				end = mid - 1;
			}
		}
		System.out.println("Ceiling of " + k + " in given array" + "is : " + ceiling);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 4, 7, 8, 10 };
		floor(arr, 4);
		ceiling(arr, 4);
	}
}
