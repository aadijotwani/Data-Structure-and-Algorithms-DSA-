package recursionSheet1;

import java.util.Scanner;
public class Power {
	
	public static double myPow(double x, int n) {
		 long N = n;
		 
		 if(N<0) {
			 x = 1/x;
			 N = -N;
		 }
		 
		 return Pow(x, N);
	}
	
	public static double Pow(double x, long n) {
		if(n==0) {
			return 1;
		}
		
		return (n%2==0)? Pow(x*x, n/2) : x*Pow(x*x, n/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,n;
		System.out.print("Please enter the base value: ");
		x = sc.nextInt();
		System.out.println();
		System.out.print("Please enter the Power");
		n = sc.nextInt();
		
		System.out.println(myPow(x, n));
	}

}
