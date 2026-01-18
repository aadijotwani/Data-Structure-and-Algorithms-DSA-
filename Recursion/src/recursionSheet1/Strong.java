package recursionSheet1;

import java.util.Scanner;
public class Strong {
	
	public static int sum(int n) {
		if(n==0)
			return 0;
		
		return sum(n/10)+factorial(n%10);
	}
	
	public static int factorial(int num) {
		if(num==0) 
			return 1;
		
		return factorial(num-1)*num;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Pleas enter a number");
		num=sc.nextInt();

		if(sum(num) == num)
			System.out.println("Yayy balle balle");
		
		else {
			System.out.println("oops");
		}
	}

}
