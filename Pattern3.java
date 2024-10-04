package InterviewQuestion;

import java.util.Scanner;

public class Pattern3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int alpha=65;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
			
		}
		System.out.println("*************************");
		
		int alphabet=65;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet)+" ");
			}
			alphabet++;
			System.out.println();
			
		}
		
		
	}

}
