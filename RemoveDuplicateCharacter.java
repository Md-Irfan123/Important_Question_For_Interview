package InterviewQuestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacter {
	
	public static String removeDuplicateCharacter(String s) {
		
		StringBuilder sb=new StringBuilder();
		 Set<Character> hs=new HashSet<Character>();
		 
		 for(int i=0;i<s.length();i++) {
			 
			 hs.add(s.charAt(i));
		 }
		 for(Character c:hs) {
			 sb.append(c);
			 
			 
		 }
		 return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");  // Programming
		String s=sc.nextLine();
		
		System.out.println("String without duplicate character: "+removeDuplicateCharacter(s));
		
	}

}
