package InterviewQuestion;

import java.util.Scanner;

public class PalindromeString {
	
	public static boolean palindromeString(String s) {
		String rev="";
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return s.equalsIgnoreCase(rev);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String value "); // Madam
		String s=sc.nextLine();
		if(palindromeString(s)) {
			System.out.println("The palindrome Stirng is: "+s); // Madam
		}else {
			System.out.println("It is not a palindrome Stirng");
		}
		
	}

}
