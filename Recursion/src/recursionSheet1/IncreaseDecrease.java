package recursionSheet1;

import java.util.Scanner;
public class IncreaseDecrease {
	
	public static void IncDec(int n, int k){
		if(k>n) {
			return;
		}
		System.out.print(k+" ");
		IncDec(n, k+1);
		System.out.print(k+" ");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		 IncDec(n, k);
	}

}
