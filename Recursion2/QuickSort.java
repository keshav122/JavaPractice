package Recursion2;

public class QuickSort {

	public static void quickSort(int[] input) {
		quickSort(input , 0 , input.length -1);
	}
	private static void quickSort(int[] input, int sI, int eI) {
		if(sI >= eI){
			return;
		}
		int pivotPosition = partition(input , sI, eI);
		quickSort(input, sI, pivotPosition -1);
		quickSort(input, pivotPosition +1 , eI);
	}
	
	private static int partition(int[] input, int sI, int eI) {
		int pivotElement = input[sI];
		int count = 0;
		for(int i = sI +1 ;i<=eI;i++){
			if(input[i] <= pivotElement){
				count++;
			}
		}
		int pivotIndex = sI+ count;
		input[sI] = input[pivotIndex];
		input[pivotIndex] = pivotElement;
		int i = sI , j= eI;
		while(i< pivotIndex && j > pivotIndex){
			if(input[i] <= pivotElement){
				i++;
			}else{
				if(input[j] > pivotElement){
					j--;
				}else{
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
					i++;
					j--;
				}
			}
		}
		return pivotIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
