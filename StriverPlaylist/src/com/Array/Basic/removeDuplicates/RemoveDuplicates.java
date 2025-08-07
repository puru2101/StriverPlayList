package com.Array.Basic.removeDuplicates;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	static int removeDuplicates(int[] arr) {
		int i = 0;

		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 5 };
		
		Set<Integer> st= new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			st.add(arr[i]);
		}
		
		st.stream().collect(Collectors.toList()).forEach(e->System.out.print(e+","));
		//int k = removeDuplicates(arr);

//		for (int i = 0; i < k; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}
}
