package com.Array.Easy;

public class StockBuyAndSell1 {

	public static int MaxProfitNaive(int arr[]) {
		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
			}
		}
		return maxProfit;
	}

	public static int MaxProfitOptimize(int arr[]) {
		int maxSoFar = 0;

		int minSoFar = arr[0];

		for (int i = 0; i < arr.length ; i++) {

			minSoFar = Math.min(minSoFar, arr[i]);
			
			maxSoFar = Math.max(maxSoFar, arr[i] - minSoFar);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 2, 5, 7, 9, 6, 1 };
		System.out.println(MaxProfitNaive(arr));
		
		//System.out.println(MaxProfitOptimize(arr));

	}

}
