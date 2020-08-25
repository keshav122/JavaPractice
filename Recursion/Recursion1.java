package Recursion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion1 {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		int smallAns = fact(n - 1);
		return n * smallAns;
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	public static void print(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		print(n - 1);
		System.out.print(n + " ");

	}

	public static int count(int n) {

		if (n < 10) {
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}

	public static int count1(int n) {
		if (n % 10 == 0 && n != 0) {
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int sum(int input[]) {
		int sum = 0;
		if (input.length == 0) {
			return sum;
		}
		if (input.length == 1) {
			return input[0];
		}

		int smallArr[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallArr[i - 1] = input[i];
		}
		int total = sum(smallArr);
		return total + input[0];
	}

	public static boolean checkNumber(int input[], int x) {
		if (input.length <= 0) {
			return false;
		}
		if (input[0] == x) {
			return true;
		}
		int smallArr[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallArr[i - 1] = input[i];
		}
		boolean isPresent = checkNumber(smallArr, x);
		return isPresent;
	}

	public static boolean checkSorted(int arr[]) {
		if (arr.length <= 1) {
			return true;
		}

		int smallArr[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		boolean ans = checkSorted(smallArr);
		if (!ans) {
			return false;
		} else {
			if (arr[0] <= arr[1]) {
				return true;
			} else {
				return false;
			}
		}
	}

	private static boolean checkSortedBetter(int arr[] , int startIndex){
		if(startIndex >= arr.length -1){
			return true;//we are returning true because if there are one or no elements left it must be sorted 
		}
		
		if(arr[startIndex] > arr[startIndex +1]){
			return false ;
		}
		boolean smallAns = checkSortedBetter(arr, startIndex+1);
		return smallAns;
	}
	
	private static boolean checkSortedBetter(int arr[] ){
		return checkSortedBetter(arr, 0);
	}
	
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x , 0);
	}
	private static int firstIndex(int[] input, int x, int startIndex) {
		if(startIndex >= input.length){
			return -1;
		}
		if(input[startIndex] == x){
			return  startIndex;
		}
		return firstIndex(input, x, startIndex+1);
	}

	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
	}
	
	private static int lastIndex(int[] input, int x, int startIndex) {
		if(startIndex >= input.length){
			return -1;
		}
		int ans = lastIndex(input, x, startIndex+1);
		if(ans != -1){
			return ans;
		}else{
			if(input[startIndex] == x){
				return startIndex;
			}else{
				return -1;
			}
		}
	}

	public static int[] allIndexes(int input[], int x) {
	 return  allIndexes(input, x, 0);
	}
	
	private static int[] allIndexes(int[] input, int x, int startIndex) {
		if(startIndex >= input.length){
		int a[] = new int[0];
		return a;
		}
		int smallAns[] = allIndexes(input, x, startIndex+1);
		if(input[startIndex] != x){
			return smallAns;
		}else{
			int arr[] = new int[smallAns.length+1];
			arr[0] = startIndex;
			for(int i = 1; i< arr.length;i++){
				arr[i] = smallAns[i-1];
			}
			return arr;
		}
	}

	

	public static void main(String[] args) {
		// int x = 3;
		// Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		// //print(n);
		// System.out.println(fibonacci(n));

		int input[] = { 8, 8, 8 };
		System.out.println(checkSorted(input));
	}

}
