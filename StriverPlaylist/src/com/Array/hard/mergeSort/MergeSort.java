package com.Array.hard.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void mergeSort(int arr[], int start, int end) {
		int mid = (start + end) / 2;

		if (start >= end)
			return;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	static void merge(int[] arr, int start, int mid, int end) {

		List<Integer> ls = new ArrayList<>();
		int first = start;
		int second = mid + 1;

		while (first <= mid && second <= end) {
			if (arr[first] <= arr[second]) {
				ls.add(arr[first]);
				first++;
			} else {
				ls.add(arr[second]);
				second++;
			}
		}

		while (first <= mid) {
			ls.add(arr[first]);
			first++;
		}

		while (second <= end) {
			ls.add(arr[second]);
			second++;
		}

		for (int i = start; i <= end; i++) {
			arr[i] = ls.get(i - start);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 4, 5, 1, 3, 5, 4 };
		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ,");

		}
	}

}
