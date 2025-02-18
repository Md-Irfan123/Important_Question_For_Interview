package InterviewQuestion;

import java.util.Scanner;


public class FirstNonRepeatingCharacter {

   
    public static int firstUniqueCharacter(String s) {
        // Frequency array to store the count of each character (assuming lowercase letters)
        int[] freq = new int[26]; 
        
        for(int i=0;i<s.length();i++) {
        	freq[s.charAt(i)-'a']++;
        }
        
        // Second loop to find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }
        
        return -1; // Return -1 if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input
        System.out.println("Enter the String:");
        String s = sc.nextLine(); // Read the input string
        
        // Output the result by calling the method
        int index = firstUniqueCharacter(s);
        if (index != -1) {
            System.out.println("The first non-repeating character is at index: " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }

       
    }
}
