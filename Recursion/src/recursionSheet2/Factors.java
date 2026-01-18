package recursionSheet2;

import java.util.Scanner;
public class Factors {
	public static void findFactors(int n, int k){
		if(n<k*k)
			return;
		
		if(n%k==0) {
			System.out.print(k+" ");
			if(k != n/k)
				System.out.print(n/k+" ");
		}
			
			
		
		findFactors(n, k+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int k=1;
		System.out.print("Please enter a number = ");
		n = sc.nextInt();
		findFactors(n, k);
		
	}
}
