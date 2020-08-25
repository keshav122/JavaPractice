package Recursion2;

import java.util.Scanner;

public class PrintSubsetsSumToK {

    public static void printSubsetsSumTok(int input[], int k) {
    	int oP[] = new int[0];
	 printSubsetsSumTok(input, k ,0 , oP);
		
	}
	private static void printSubsetsSumTok(int[] input, int k, int startIndex, int[] output) {
		if(startIndex == input.length){
			if(k == 0){
				for(int i : output){
					System.out.print(i+" ");
				}
				System.out.println();
				return ; 
			}
			else
			{
				return ; 
			}	
		}
		
		int newoutput[] = new int[output.length+1]; 
		int i = 0;
		for( ; i< output.length;i++){
			newoutput[i] = output[i];
		}
        newoutput[i] = input[startIndex];
		printSubsetsSumTok(input, k-input[startIndex], startIndex + 1, newoutput);
		printSubsetsSumTok(input, k, startIndex + 1, output);
		
	}
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		PrintSubsetsSumToK.printSubsetsSumTok(input, k);
	}
}
