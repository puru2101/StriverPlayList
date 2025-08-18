package com.Array.Easy.jumpGame;

public class JumpGame {

	public static boolean jumpGame(int arr[]) {
		int maxReach = 0;
		int n = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (i > maxReach) {
				return false;
			}
			maxReach = Math.max(maxReach, i + arr[i]);
			if (maxReach >= n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 0, 4 };
		System.out.println(jumpGame(arr));
	}

}
