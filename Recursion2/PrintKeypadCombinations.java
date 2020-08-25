package Recursion2;

import java.util.ArrayList;

public class PrintKeypadCombinations {

	private static char[] helper(int n) {
		char c[] = {};
		if (n <= 1) {
			return c;
		} else if (n == 2) {
			char a[] = { 'a', 'b', 'c' };
			return a;
		} else if (n == 3) {
			char a[] = { 'd', 'e', 'f' };
			return a;
		} else if (n == 4) {
			char a[] = { 'g', 'h', 'i' };
			return a;
		} else if (n == 5) {
			char a[] = { 'j', 'k', 'l' };
			return a;
		} else if (n == 6) {
			char a[] = { 'm', 'n', 'o' };
			return a;
		} else if (n == 7) {
			char a[] = { 'p', 'q', 'r', 's' };
			return a;
		} else if (n == 8) {
			char a[] = { 't', 'u', 'v' };
			return a;
		} else {
			char a[] = { 'w', 'x', 'y', 'z' };
			return a;
		}
	}

	private static String helper_1(int n) {
		if (n <= 1) {
			return "";
		} else if (n == 2) {
			return "abc";
		} else if (n == 3) {
			return "def";
		} else if (n == 4) {
			return "ghi";
		} else if (n == 5) {
			return "jkl";
		} else if (n == 6) {
			return "mno";
		} else if (n == 7) {
			return "pqrs";
		} else if (n == 8) {
			return "tuv";
		} else {
			return "wxyz";
		}
	}

	private static String helper_2(int n) {
		ArrayList<String> keypad = new ArrayList<String>(){{ 
            add(""); 
            add("abc"); 
            add("def"); 
            add("ghi"); 
            add("jkl"); 
            add("mno"); 
            add("pqrs"); 
            add("tuv"); 
            add("wxyz"); 
		}};
		return keypad.get(n-1);
	}
	
	private static void printKeyPadCombinations(int input) {
		printKeyPadCombinations(input, "");
	}

	private static void printKeyPadCombinations(int input, String outputSoFar) {
		if (input == 0) {
			System.out.println(outputSoFar);
			return;
		}
		int val = input % 10;
		String ans = helper_2(val);
		for (int i = 0; i < ans.length(); i++) {
			printKeyPadCombinations(input / 10, ans.charAt(i) + outputSoFar);
		}
	}

	public static void main(String[] args) {
		printKeyPadCombinations(234);

	}

}
