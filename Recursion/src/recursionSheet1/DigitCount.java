package recursionSheet1;

import java.util.Scanner;
public class DigitCount {
	
	public static int Counting(int n) {
		if(n==0) {
			return 0;
		}
		
		return Counting(n/10)+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Please enter a number");
		n = sc.nextInt();
		System.out.println(Counting(n));

	}

}
