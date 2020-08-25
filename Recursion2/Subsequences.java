package Recursion2;

import java.util.Scanner;

public class Subsequences {

	public static String[] findSubsequences(String str) {
		if (str.isEmpty()) {
			String ans[] = { "" };
			return ans;
		}
		String smallAns[] = findSubsequences(str.substring(1));
		String ans[] = new String[2 * smallAns.length];
		int i = 0;
		while (i < smallAns.length) {
			ans[i] = smallAns[i];
			i++;
		}
		int j = 0;
		while (i < ans.length) {
			ans[i] = str.charAt(0) + smallAns[j];
			i++;
			j++;
		}
		return ans;
	}

	public static void print(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a[] = findSubsequences(str);
		print(a);
        s.close();
	}

}
