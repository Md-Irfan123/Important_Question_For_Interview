package InterviewQuestion;

import java.util.Scanner;

public class FibnocciSeries {
	
//	public static void fib(int n) {
//		int n1=0, n2=1;
//		int sum=0;
//			System.out.print(n1+" "+n2);
//		
//			for(int i=2;i<=n;i++) {
//				
//				sum=n1+n2;
//				System.out.print(" "+sum);
//				n1=n2;
//				n2=sum;
//				
//			}
//			
//		}
	
	public static int getFib(int n) {
		if(n==1)
			return 0;
		else if(n==2 || n==3)
			return 1;
		else
			return	getFib(n-2)+getFib(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
//		fib(n);
		System.out.println(n+"th term of fibnocci series is: "+getFib(n));
	}
	
	

}
