package Recursion2;

import java.util.Scanner;

public class PrintSubsetsOfArray {

	public static void printSubsets(int input[]) {
		int oP[] = new int[0];
		 printSubsets(input , 0, oP);

	}
	
	private static void printSubsets(int[] input, int startIndex , int output[]) {
		if(startIndex == input.length){
			for(int i = 0; i< output.length;i++){
				System.out.print(output[i]+" ");
			}
            System.out.println();
            return;
		}
		int[] newOutput = new int[output.length+1];
		int i = 0;
		for(; i< output.length;i++){
			newOutput[i] = output[i];
		}
        newOutput[i] = input[startIndex];
		printSubsets(input, startIndex+1, newOutput);
		printSubsets(input, startIndex+1, output);
		
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] input = takeInput();
		PrintSubsetsOfArray.printSubsets(input);
	}
}
