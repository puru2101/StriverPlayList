package com.Array.binarySearch;

public class FirstandLastOcc {

	public static void First(int[] arr, int k) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		int first = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == k) {
				first = mid;
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			}
		}
		System.out.println("first  index of " + " " + k + " is : " + first);
	}

	public static void Last(int[] arr, int k) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		int last = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == k) {
				last = mid;
				start = mid + 1;
			} else if(arr[mid]<k) {
				start = mid + 1;
			}else if (arr[mid] > k) {
				end = mid - 1;
			}
		}
		System.out.println("Last index of  " + " " + k + " is : " + last);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8 };
		// 0, 1, 2, 3, 4, 5 ,6, 7, 8 ,9 ,10,11

		First(arr, 4);
		Last(arr, 4);
	}

}
