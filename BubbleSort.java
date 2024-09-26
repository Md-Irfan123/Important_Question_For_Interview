package InterviewQuestion;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] sort(int[] a) {
		
		int n=a.length;
		for(int i=0;i<n-1;i++) {  // Run till n-1 to avoid extra iteration
			int x=0;
			
		for(int j=0;j<n-i-1;j++) {   // Ensure j+1 is within bounds
			
			if(a[j]>a[j+1]){
				
				 // Swapping without a temp variable using addition/subtraction
					
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					
					x++;
					
				}
			}
			if(x==0)  //  break if no swaps occur
				break;
				
		}
		return a;
	
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
		int[] b=sort(arr);
		System.out.println("The sorted elements are");
		for(int a:b) {
			System.out.print(a+" ");
		}
		
	}

}
