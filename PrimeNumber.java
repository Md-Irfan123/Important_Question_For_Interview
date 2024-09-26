package InterviewQuestion;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrime(int n) {
		 if(n<=1) 
			 return false;
		 
		 for(int i=2;i<=n/2;i++) {
			 if(n%i==0)
				 return false;
		 }
		 return true;		 
		 
	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		
//			if(checkPrime(n)) {
//				System.out.println(n+ " is a prime no.");
//			}else {
//				System.out.println("It is not a prime no. ");
//			}
//		
//	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nThe total prime no. is "+count);
	}
		
		
	
	

}
