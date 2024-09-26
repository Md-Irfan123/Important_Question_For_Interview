package InterviewQuestion;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateElement {

    public static int[] removeDuplicateElement(int[] a) {
        Set<Integer> hs = new HashSet<>(); // Using Set to avoid duplicates

        // Adding elements to the Set (which automatically handles duplicates)
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }

        
        // Convert Set back to array
        int[] result = new int[hs.size()];
        int index = 0;
        for (int value : hs) {
            result[index++] = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element no : " + (i + 1));
            arr[i] = sc.nextInt();
        }

        // Get array without duplicates
        int[] b = removeDuplicateElement(arr);
        System.out.println("Array without duplicate elements:");
        for (int c : b) {
            System.out.print(c + " ");
        }
    }
}

