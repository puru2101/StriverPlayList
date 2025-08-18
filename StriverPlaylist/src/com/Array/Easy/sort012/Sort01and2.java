package com.Array.Easy.sort012;

import java.util.stream.IntStream;

public class Sort01and2 {

	public static void sort(int arr[]) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
			}
			else if (arr[mid] == 1) {
				mid++;
			}
			else  {
				int temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 2, 1, 0, 1, 2, 0, 0,1,1,2,1,1,2,2 };
		sort(arr);
		IntStream.of(arr).boxed().forEach(e -> System.out.print(e + ", "));
	}

}
