package recursionSheet1;

import java.util.Scanner;
public class Increasing {
	
	public static void Increase(int n) {
		
		if(n==0) {
			return;
		}
		Increase(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter a number to count till it: ");
		n = sc.nextInt();
		Increase(n);
	}

}
