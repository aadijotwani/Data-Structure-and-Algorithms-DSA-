package recursionSheet2;

import java.util.Scanner;
public class UniquePrimeFactors {
	
	public static void Cal(int n, int i) {
		if(n==1)
			return;
		
			if(n%i==0) {
				System.out.print(i+" ");
				Cal(n/i, i+1);
			}
			
				Cal(n, i+1);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Please enter a number: ");
		n=sc.nextInt();
		
		Cal(n, 2);
	}

}
