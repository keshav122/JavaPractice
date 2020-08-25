package Recursion;

public class Recursion1a {

	public static int multiplyTwoIntegers(int m, int n) {
		if (n == 0) {
			return 0;
		}
		return m + multiplyTwoIntegers(m, n - 1);
	}

	public static int countZerosRec(int input){
		 if(input < 10){
	          if(input == 0){
	              return 1;
	          }else{
	              return 0;
	          }
	        }
	        int lastDigit = input % 10;
	        if(lastDigit == 0){
	            return countZerosRec(input/10)+ 1;
	        }else{
	            return countZerosRec(input/10);
	        }
	}

	public static double findGeometricSum(int k){
		if(k == 0){
			return 1;
		}
		return (1/Math.pow(2, k))+ findGeometricSum(k-1);
	}
	
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0 , input.length() -1);
	}
	private static boolean isStringPalindrome(String input, int startIndex, int endIndex) {
	if(startIndex >= endIndex ){
		return true;
	}
	
	if(input.charAt(startIndex) != input.charAt(endIndex)){
		return false;
	}else{
		return isStringPalindrome(input, startIndex+1, endIndex-1);
	}
		
	}
	public static int sumOfDigits(int input){
		if(input < 10){
			return input;
		}
     return (input %10) + sumOfDigits(input/10);
	}

	public static void main(String[] args) {
		

	}

}
