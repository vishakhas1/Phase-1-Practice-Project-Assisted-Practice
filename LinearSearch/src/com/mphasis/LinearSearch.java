package com.mphasis;

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 40, 20, 30, 120, 70, 80 };
		int key = 120;
		System.out.println(key + " is found at index: " + linearSearch(a1, key));
	}
}