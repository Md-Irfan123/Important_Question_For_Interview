package InterviewQuestion;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static int countDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static int power(int base,int exponent) {
		int pow=1;
		for(int i=1;i<=exponent;i++) {
			pow=pow*base;
		}
		return pow;
	}
	public static boolean checkArmStrong(int n) {
		int sum=0;
		int a=n;
		int count=countDigit(n);
		while(n>0) {
			int	rem=n%10;
			sum=sum+power(rem,count);
		
			n=n/10;	
		}
		return sum==a;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(checkArmStrong(n)) {
			System.out.println(n+ " is a ArmStrongNumber");
		}else {
			System.out.println("It is not a ArmStrongNumber");
		}
		
	}
	
//	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number");
//	int n=sc.nextInt();
//	int count=0;
//	for(int i=1;i<=n;i++) {
//		if(checkArmStrong(i)) {
//			System.out.print(i+" ");
//			count++;
//		}
//		
//	}
//	System.out.print("\nThe total ArmStrongNumber are: "+count);
//	}

}
