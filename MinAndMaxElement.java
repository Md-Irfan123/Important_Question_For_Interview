package InterviewQuestion;

import java.util.Scanner;

import java.util.Scanner;

public class MinAndMaxElement {

    public static void foundMinAndMaxElement(int[] a) {

        // Initialize min and max with the first element of the array
        int min = a[0];
        int max = a[0];
        
        // If the array has only one element
        if (a.length == 1) {
            System.out.println("Array has only one element: " + a[0] + ". Min and max are the same.");
        } else {
            // Loop through the array to find min and max
            for (int i = 1; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];  // Update max if current element is greater
                }
                if (a[i] < min) {
                    min = a[i];  // Update min if current element is smaller
                }
            }
            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element no. " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        foundMinAndMaxElement(arr);  // Call the method to find min and max
        sc.close();
    }
}

