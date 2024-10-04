package InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrayInOneArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {4,2,3};
		int[] b= {5,6,7};
		
		int[] c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(c));

	}

}
