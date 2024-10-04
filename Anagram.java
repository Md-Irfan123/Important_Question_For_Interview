package InterviewQuestion;

import java.util.Arrays;

//      Take two String as input(ex:- Keep, peek)
//      check the length of one string is equal to another string
//      convert both string to character array
//      sort both strings using Arrays.sort method

public class Anagram {

	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		if(checkAnagram(s1,s2)) {
			System.out.println(s1+" and "+s2+" is a anagram");
		}
		else {
			System.out.println(s1+" and "+s2+" is not a  anagram");
		}
	}
		public static boolean checkAnagram(String s1, String s2) {
			
			if(s1.length()!=s2.length()) {
				return false;
				
			}
			else {
				char[] ch1=s1.toCharArray();
				char[] ch2=s1.toCharArray();
				Arrays.toString(ch1);
				Arrays.toString(ch2);
				if(Arrays.equals(ch1, ch2)) {
					return true;
				}
				else {
					return false;
				}
			}
		}

	}


