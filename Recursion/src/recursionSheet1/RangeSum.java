package recursionSheet1;

import java.util.Scanner;
public class RangeSum {
	
	public static int Range(int n1, int n2) {
			if(n2>n1)
				return 0;
			
			return Range(n1-1, n2)+n1;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Please enter Number 1: ");
		num1 = sc.nextInt();
		System.out.println();
		System.out.print("Please enter Number 2: ");
		num2 = sc.nextInt();
		
		System.out.println("Range Sum = "+(num1>num2? Range(num1, num2) : Range(num2, num1)));
	}

}
