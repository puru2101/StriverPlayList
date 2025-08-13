package com.Array.Easy.union;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArrays {
	public static List<Integer> union(int[] arr1, int[] arr2) {
		List<Integer> ls = new ArrayList<>();
		int n1 = arr1.length - 1;
		int n2 = arr2.length - 1;

		int first1 = 0;
		int first2 = 0;

		while (first1 <= n1 && first2 <= n2) {
			if (arr1[first1] <= arr2[first2]) {
				if (!ls.contains(arr1[first1])) {
					ls.add(arr1[first1]);
				}
				first1++;
			} else {
				if (!ls.contains(arr2[first2])) {
					ls.add(arr2[first2]);
				}

				first2++;
			}

		}
		while (first1 <= n1) {
			if (!ls.contains(arr1[first1])) {
				ls.add(arr1[first1]);
			}
			first1++;
		}

		while (first2 <= n2) {
			if (!ls.contains(arr2[first2])) {
				ls.add(arr2[first2]);
			}
			first2++;
		}
		return ls;
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 5, 8, 7 };
		int arr2[] = { 2, 4, 8, 7 };
		union(arr1, arr2).stream().forEach(e -> System.out.print(e + " ,"));

	}

}
