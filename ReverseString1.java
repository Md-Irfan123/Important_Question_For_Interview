package InterviewQuestion;

public class ReverseString1 {

	public static void main(String[] args) {
		
	       
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        
        // Print the reversed array
        System.out.println(s);
	}
		
		public static void reverseString(char[] a) {
			int start=0;
			int end=a.length-1;
			while(start<=end) {
				char temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				
				start++;
				end--;
				
			}

	}

}
