package recursionSheet1;

import java.util.Scanner;
public class Decreasing {
	
	public static void Decrease(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		Decrease(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter a number: ");
		n = sc.nextInt();
		Decrease(n);
				

	}

}
