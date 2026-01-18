package array_Practise_Sheet2;

import java.util.Scanner;
public class KthLargestNewWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5, 2, 8, 3, 6, 7, 1};
		System.out.println("Please enter a Nth largest to find");
		int n = sc.nextInt();
		int max = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i] > arr[arr.length-1]) {
				
				
			}
		}

	}

}
