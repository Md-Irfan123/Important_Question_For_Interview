package InterviewQuestion;

import java.util.Scanner;

public class LowerCase {
	
	public static String toLowerCase(String s) {
		
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=65 && c[i]<=90) {
				c[i]=(char)(c[i]+32);
			}
		}
		return String.valueOf(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println(toLowerCase(s));
		
	}

}
