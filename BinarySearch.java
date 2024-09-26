package InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] a,int search) {
		
		int low=0;
		int high=a.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==search){
				return mid;      // Element found at mid
				
			}else if(a[mid]<search) {
				low=mid+1;				// Search right half
				
			}else {
				high=mid-1;			// Search left half
			}

		}
		return -1;		 // Element not found
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element no. "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		 // Sorting the array since binary search requires a sorted array
		
        Arrays.sort(arr);
	
	System.out.println("Enter the search element");
	int search=sc.nextInt();
	int index=binarySearch(arr,search);
	if(index>=0) {
		System.out.println("Element is found at index "+index);
	}else
		System.out.println("Element is not found");
	}


}
