package InterviewQuestion;

import java.util.Scanner;

public class OccurenceOfEachElement {
	
	public static void countOccurence(int[] a) {
		int n=a.length-1;
		
		for(int i=0;i<=n;i++) {
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
				count++;
				a[j]=a[n];
				n--;
				j--;
				}
			}
			System.out.println(a[i]+" ==> "+count+" times");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element no. "+(i+1));
			a[i]=sc.nextInt();
		}
		countOccurence(a);
	}
		
	}


