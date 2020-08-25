package Recursion;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Recursion1b {

	public static String replace(String input) {
		if (input.length() <= 1) {
			return input;
		}

		String temp = replace(input.substring(1));
		if (input.charAt(0) == 'p' && temp.charAt(0) == 'i') {
			return "3.14" + temp.substring(1);
		} else {
			return input.charAt(0) + temp;
		}
	}

	public static String removeX(String input) {
		return removeX(input, 0);

	}

	private static String removeX(String input, int startIndex) {
		if (startIndex >= input.length()) {
			return "";
		}
		String smallAns = removeX(input, startIndex + 1);

		if (input.charAt(startIndex) == 'x') {
			return smallAns;
		} else {
			return input.charAt(startIndex) + smallAns;
		}
	}

	public static int convertStringToInt(String input) {
		return convertStringToInt(input, input.length() - 1);
	}

	private static int convertStringToInt_2(String input, int startIndex) {
		if (startIndex >= input.length()) {
			return 0;
		}
		int smallAns = convertStringToInt(input, startIndex + 1);
		int temp = (int) (((int) input.charAt(startIndex) - 48)
				* Math.pow(10, input.substring(startIndex).length() - 1));
		return temp + smallAns;

	}

	public static int convertStringToInt(String input, int startIndex) {
		if (input.length() == 1) {
			return input.charAt(0) - '0';
		}
		int smallAns = convertStringToInt(input.substring(0, input.length() - 1));
		int lastDigit = input.charAt(input.length() - 1) - '0';
		return smallAns * 10 + lastDigit;

	}

	public static String addStars(String s) {
		if(s.length() <= 1){
			return s ;
		}
        String smallAns = addStars(s.substring(1));
        if(s.charAt(0) == smallAns.charAt(0)){
        	return s.charAt(0) + "*"+ smallAns;
        }else{
        	return s.charAt(0) +smallAns ;
        }
	}

	public static String addStars_2(String s) {
		return addStars(s, 0);
	}

	
	private static String addStars(String s, int startIndex) {
		if(startIndex == s.length() -1){
			String temp = ""+ s.charAt(startIndex);
			return temp;
		}
		String smallAns = addStars(s, startIndex+1);
		if(s.charAt(startIndex) == smallAns.charAt(startIndex)){
			return s.charAt(startIndex) + "*" + smallAns;
		}else{
			return s.charAt(startIndex) + smallAns;
		}
	}

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks == 1){
			System.out.println(source+" "+ destination);
			return;
		}

		towerOfHanoi(disks -1 , source, destination, auxiliary);
		System.out.println(source+" "+ destination);
		towerOfHanoi(disks-1, auxiliary, source, destination);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(addStars(str));
	}

}
