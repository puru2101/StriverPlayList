package com.Array.Basic.NumberAppearOnce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void NumberAppearOnce(int arr[]) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (Integer n : arr) {
			if (!mp.containsKey(n)) {
				mp.put(n, 1);
			} else
				mp.put(n, mp.get(n) + 1);

		}
		for (Entry<Integer, Integer> n : mp.entrySet()) {
			if (n.getValue() == 1) {
				System.out.println(n.getKey() + ": " + n.getValue());
			}
		}
	}

	public static void NumberAppearOnceStream(int arr[]) {
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() == 1).forEach(e -> System.out.println(e + ","));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 8, 8, 8, 8 };

		//NumberAppearOnce(arr);
		NumberAppearOnceStream(arr);

	}

}
