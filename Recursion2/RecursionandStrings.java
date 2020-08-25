package Recursion2;

public class RecursionandStrings {

	public static String removeX(String input){
		return removeX(input , 0);
	}
	private static String removeX(String input, int startIndex) {
		if(startIndex >= input.length()){
			return "";
		}
		String smallAns = removeX(input, startIndex +1);
		if(input.charAt(startIndex) == 'x'){
			return smallAns;
		}else{
			return input.charAt(startIndex)+smallAns;
		}
	}
	public static String removeX_2(String input){
		if(input.isEmpty()){
			return input;
		}
		String ans = "";
		if(input.charAt(0) != 'x'){
			ans += input.charAt(0);
		}
		String smallAns = removeX_2(input.substring(1));
		return ans+smallAns;
	}
	
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0){
			return "";
		}
       String smallAns = replaceCharacter(input.substring(1), c1, c2);
       if(input.charAt(0) == c1){
    	   return c2+smallAns;
       }else{
    	   return input.charAt(0)+smallAns;
       }
	}

	public static String removeConsecutiveDuplicates(String s) {
		if(s.length() <= 1){
			return s;
		}
		String smallAns = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == smallAns.charAt(0)){
			return s.charAt(0)+smallAns.substring(1);
		}else{
			return  s.charAt(0)+smallAns;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
