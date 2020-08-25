package Recursion2;

import java.util.Scanner;

public class ReturnSubsetsOfArray {

	public static int[][] subsets(int input[]) {
		return subsets(input , 0);

	}
	
	private static int[][] subsets(int[] input, int startIndex) {
		if(startIndex == input.length){
			int result[][] = new int[1][0];
			return result;
		}
		
		int smallOutput[][] = subsets(input, startIndex + 1);
		int ans[][] = new int[2 * smallOutput.length][];
		
		int k = 0;
		for(int i = 0 ; i < smallOutput.length;i++){
			//specifying the length of each row of jagged 2D array
			ans[k] = new int[smallOutput[i].length];
			
			for(int j = 0; j< smallOutput[i].length ;j++){
				ans[k][j] = smallOutput[i][j];
			}
			k++;
		}
		
		
		for(int i = 0 ; i < smallOutput.length;i++){
			//specifying the length of each row of jagged 2D array
			ans[k] = new int[smallOutput[i].length + 1];
		    ans[k][0] = input[startIndex];
			for(int j = 1; j<=smallOutput[i].length ;j++){
				ans[k][j] = smallOutput[i][j-1];
			}
			k++;
		}
		return ans;
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
		int output[][] = ReturnSubsetsOfArray.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
