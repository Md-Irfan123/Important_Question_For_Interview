package InterviewQuestion;

import java.util.Arrays;

//      Take two String as input(ex:- Keep, peek)
//      check the length of one string is equal to another string
//      convert both string to character array
//      sort both strings using Arrays.sort method

public class Anagram {

	public static void main(String[] args) {
		String s1="goat";
		String s2="taog";
		if(checkAnagram(s1,s2)) {
			System.out.println(s1+" and "+s2+" is an Anagram");
		}
		else {
			System.out.println(s1+" and "+s2+" is not an Anagram");
		}
	}
		public static boolean checkAnagram(String s1, String s2) {
			
			if(s1.length()!=s2.length()) {
				return false;
			}
			
				int[] freq=new int[26];
				
			for(int i=0;i<s1.length();i++) {
				freq[s1.charAt(i)-'a']++;
			}
			for(int i=0;i<s2.length();i++) {
				freq[s2.charAt(i)-'a']--;
				if(freq[s2.charAt(i)-'a']<0) {
					return false;
				}
			}
			return true;
		}
			
		

	}


