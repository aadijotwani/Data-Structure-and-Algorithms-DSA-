package recursionSheet1;

import java.util.Scanner;
public class Sum {
	
	public static int findSum(int n) {
		
		if(n==0)
			return 0;
		
		return findSum(n-1)+n;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter a number");
		n=sc.nextInt();
		
		System.out.println(findSum(n));
		

	}

}
