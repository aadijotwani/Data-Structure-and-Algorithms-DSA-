package recursionSheet1;

import java.util.Scanner;
public class PrimeNnumbers {
	
	public static boolean Check(int n) {
		if(n<2)
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter a number: ");
		n=sc.nextInt();
		
		System.out.println(Check(n)==true? "It is a Prime Number": "It is not a Prime Number");
		

	}

}
