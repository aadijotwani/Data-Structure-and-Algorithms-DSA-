package LeetCode;

import java.util.Scanner;
public class MissingNumber {
	
	public static int Missing(int[] arr) {
		
		int sum=0;
		int total = arr.length * (arr.length + 1)/2;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		int missing = total-sum;
		return missing;
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter the size of the array: ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Please enter the elements of the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int missing = Missing(arr);
		System.out.println("Missing Number is : "+ missing);
	}
}
