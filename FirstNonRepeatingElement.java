package InterviewQuestion;

import java.util.Scanner;

public class FirstNonRepeatingElement {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element no. "+(i+1));
			a[i]=sc.nextInt();
		}
	
		int b=firstNonRepeatingElement(a);
		System.out.println("\nThe First Non Repeating element are: "+b);
		
		
	}
		
		public static int firstNonRepeatingElement(int[] nums) {
		
			for(int i=0;i<nums.length-1;i++) {
				int count=0;
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]==nums[j]) {
						count++;
					}
					
				}
				if(count==0) {
					return nums[i];
				}
						
			}
			return -1;
			
		}

}
