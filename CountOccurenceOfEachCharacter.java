package InterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachCharacter {

    public static String countOccurence(String s) {
        Map<Character, Integer> m = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        // Build the result string showing each character and its count
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            result.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(countOccurence(s));
    }
}

