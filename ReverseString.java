package InterviewQuestion;

import java.util.Scanner;

public class ReverseString {
	
//	public static String reverseString(String s) {
//		String rev="";
//		int len=s.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		return rev;
//		
//	}
	
	public static String reverseString(String s) {
		String rev="";
		char[] a=s.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string value");
		String s=sc.nextLine();
		System.out.println("The reverse String is "+reverseString(s));
	}

}
