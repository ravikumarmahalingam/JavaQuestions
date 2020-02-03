package com.paypal.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		Integer arr[] = { 10, 9, 8, 7, 6, 1, 2, 3, 4, 5 };
		System.out.println("Before Sorting:::" + Arrays.toString(arr));
		SelectionSorting(arr);
		System.out.println("After Sorting::::" + Arrays.toString(arr));
	}

	private static void SelectionSorting(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_idx = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[min_idx] > arr[j]) {
					min_idx = j;
				}
			}
			if (min_idx != i) {
				swap(arr, i, min_idx);
			}
		}
	}

	private static void swap(Integer[] arr, int i, int min_idx) {
		int tmp = arr[i];
		arr[i] = arr[min_idx];
		arr[min_idx] = tmp;
	}
}
