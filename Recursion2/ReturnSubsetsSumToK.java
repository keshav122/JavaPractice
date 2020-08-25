package Recursion2;

import java.util.Scanner;

public class ReturnSubsetsSumToK {

	public static int[][] subsetsSumK(int input[], int k) {
	   return subsetsSumK(input, k , 0);

	}
	
	private static int[][] subsetsSumK(int[] input, int k, int startIndex) {
		if(startIndex == input.length){
			if(k == 0){
				int res[][] = new int[1][0];
				return res;
			}
			else
			{
				int res[][] = new int[0][0];
				return res;
			}
			
		}
		
		int temp1[][] = subsetsSumK(input, k - input[startIndex], startIndex+1);
		int temp2[][] = subsetsSumK(input, k, startIndex +1);
		int ans[][] = new int[temp1.length+temp2.length][];
		int x = 0;
		for(int i = 0; i< temp1.length;i++){
			ans[x] = new int[temp1[i].length+1];
			ans[x][0] = input[startIndex];
			for(int j = 1 ; j <= temp1[i].length;j++){
				ans[x][j] = temp1[i][j-1];
			}
			x++;
		}
		
		for(int i = 0; i< temp2.length;i++){
			ans[x] = new int[temp2[i].length];
			for(int j = 0 ; j < temp2[i].length;j++){
				ans[x][j] = temp2[i][j];
			}
			x++;
		}
		return ans;
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
		int output[][] = ReturnSubsetsSumToK.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
