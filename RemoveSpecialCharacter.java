package InterviewQuestion;

import java.util.Scanner;

public class RemoveSpecialCharacter {
	
	public static String removeSpecialCharacter(String s) {
		
		String str=s.replaceAll("[^a-zA-Z]", "");
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");  //$ja!va$&st%ar
		String s=sc.nextLine();
		
		System.out.println("String without special character: "+removeSpecialCharacter(s));
		
	}

}
