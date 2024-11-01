package InterviewQuestion;

import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element no. "+(i+1));
			a[i]=sc.nextInt();
		}
	
		int b=uniqueElement(a);
		System.out.println("\nThe unique elements are: "+b);
		
		
	}
		
		public static int uniqueElement(int[] nums) {
		
			for(int i=0;i<nums.length;i++) {
				int count=0;
				for(int j=0;j<nums.length;j++) {
					if(nums[i]==nums[j]) {
						count++;
					}
					
				}
				if(count==1) {
					return nums[i];
				}
						
			}
			return -1;
			
		}
		

	

}
