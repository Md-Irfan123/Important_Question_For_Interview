package InterviewQuestion;

import java.util.Scanner;

import java.util.Scanner;

public class SecondLargestElement {
    
    public static int secondLargestElement(int[] a) {
        
        int largest = Integer.MIN_VALUE;
        int sec_lar = Integer.MIN_VALUE;
        
        if (a.length == 1) {
            System.out.println("Array has only one element, so no second largest element.");
            return -1;
        } else {
            // Finding the largest element
            for (int i = 0; i < a.length; i++) {
                if (a[i] > largest) {
                    sec_lar = largest;
                    largest = a[i];
                } else if (a[i] > sec_lar && a[i] != largest) {
                    sec_lar = a[i];
                }
            }
        }
        
        // If sec_lar is still Integer.MIN_VALUE, it means no second largest element was found
        if (sec_lar == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return -1;
        }
        
        return sec_lar;
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
        
        int sec_Largest = secondLargestElement(arr);
        if (sec_Largest >= 0)
            System.out.println("Second largest element is: " + sec_Largest);
        else {
            System.out.println("Second largest element not found.");
        }
        
        sc.close();
    }
}

