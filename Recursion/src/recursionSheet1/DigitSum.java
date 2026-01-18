package recursionSheet1;

import java.util.Scanner;
public class DigitSum {
	
	public static int sum(int n) {
		if(n==0)
			return 0;
		
		return sum(n/10)+(n%10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Please enter a number to find the sum of the its digits: ");
		n = sc.nextInt();
		System.out.println("Sum of digits is = "+sum(n));
		
	}

}
