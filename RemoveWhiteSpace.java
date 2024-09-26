package InterviewQuestion;

import java.util.Scanner;

public class RemoveWhiteSpace {

	
	public static String removeWhiteSpace(String s) {
		String str=s.replaceAll("\\s", "");
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");  // "  j	a	va	s	ta	r	"
		String s=sc.nextLine();
		
		System.out.println("String without whitespace: "+removeWhiteSpace(s));
		
	
	}
}
