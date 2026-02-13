package com.Array.hard.Search2DMatrix;

public class Test {

	public static boolean searchIn2DMatrixBrute(int arr[][], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == target) {
					System.out.println(arr[i][j] + ",");
					return true;
				}
			}
		}
		return false;
	}

	public static boolean searchIn2dMatrixSorted(int arr[][], int target) {

		int row = arr.length;
		int column = arr[0].length;

		int i = 0;
		int j = column - 1;
		while (i < row && j >= 0) {
			System.out.println(arr[i][j] + ",");
			if (arr[i][j] == target) {
				return true;
			} else if (arr[i][j] > target) {
				j--;
			} else
				i++;
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

		int target = 5;
		System.out.println(searchIn2DMatrixBrute(matrix, target));
		System.out.println("-----------------------------------");
		System.out.println(searchIn2dMatrixSorted(matrix, target));
	}

}
