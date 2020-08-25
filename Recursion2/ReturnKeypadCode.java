package Recursion2;


import java.util.Scanner;

public class ReturnKeypadCode {

	public static String[] keypad(int n) {
		if (n == 0) {
			String ans[] = { "" };
			return ans;
		}
		String smallAns[] = keypad(n /10);
		char a[] = helper(n % 10);
		String ans[] = new String[smallAns.length * a.length];
		int k = 0;
		for(int i = 0; i< smallAns.length;i++){
			for(int j = 0; j< a.length;j++){
				ans[k] = smallAns[i] + a[j];
				k++;
			}
		}
		return ans;
	}

	public static void print(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static char[] helper(int n) {
		char c[] = {};
		if(n <= 1){
			return c;
		}else if(n== 2){
		char a[] =  {'a','b','c'};
		 return a;
		}else if(n == 3){
			char a[] = {'d','e','f'};
			return a;
		}else if(n == 4){
			char a[] = {'g','h', 'i'};
			return a;
		}else if(n == 5){
			char a[] =  {'j','k', 'l'};
			return a;
		}else if( n == 6){
			char a[] = {'m','n', 'o'};
			return a;
		}else if( n == 7){
			char a[] = {'p','q', 'r'};
			return a ;
		}else if(n == 8){
			char a[] = {'s','t', 'u' ,'v'};
			return a ;
		}else{
			char a[] = {'w','x', 'y' ,'z'};
			return a;
		}
			
			
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = ReturnKeypadCode.keypad(input);
		ReturnKeypadCode.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
        s.close();
	}

}
