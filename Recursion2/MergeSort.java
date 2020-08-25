package Recursion2;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] input) {
		mergeSort(input, 0, input.length - 1);

	}

	private static void mergeSort(int[] input, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int mid = (startIndex + endIndex) / 2;
		mergeSort(input, startIndex, mid);
		System.out.println(startIndex+" "+mid+" HHHHHHHHHHH");
		mergeSort(input, mid + 1, endIndex);
		System.out.println(mid+" "+endIndex+" OOOOOOOOOOOOOO");
		merge(input, startIndex, endIndex);
		System.out.println(startIndex+" "+endIndex+"NNNNNNNNNNNNNNNNN");

	}

	private static void merge(int[] input, int startIndex, int endIndex) {
		int midIndex = (startIndex + endIndex) / 2;
		int arr[] = new int[endIndex - startIndex + 1];
		int i = startIndex, j = midIndex + 1, k = 0;
		while (i <= midIndex && j <= endIndex) {
			if (input[i] <= input[j]) {
				arr[k] = input[i];
				i++;
				k++;
			} else {
				arr[k] = input[j];
				j++;
				k++;
			}
		}

		while(i <= midIndex){
			arr[k] = input[i];
			i++;
			k++;
		}
		while(j <= endIndex){
			arr[k] = input[j];
			j++;
			k++;
		}
		for (int a = startIndex, l = 0; a <= endIndex; a++, l++) {
			input[a] = arr[l];
		}
	}

	public static void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
      mergeSort(a);
	}

}
