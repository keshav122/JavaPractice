package Recursion2;

public class PrintSubsequences {

	public static void printSubsequences(String input,String outputsoFar) {
		 if(input.length() == 0){
			 System.out.println(outputsoFar);
			 return; 
		 }
		 
		 //In this we choose not to include the first character in the output
		 printSubsequences(input.substring(1), outputsoFar);
		 
		//In this we choose to include the first character in the output
		 printSubsequences(input.substring(1), outputsoFar+input.charAt(0)); 
	}
	
	public static void printSubsequences(String input){
		printSubsequences(input, "");
	}
	public static void main(String[] args) {
		printSubsequences("xyz");

	}

}
