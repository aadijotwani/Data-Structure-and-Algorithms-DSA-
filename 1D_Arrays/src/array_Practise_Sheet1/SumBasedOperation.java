package array_Practise_Sheet1;

import java.util.Scanner;

public class SumBasedOperation {

	public static void Pattern() {

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[5], arr2 = new int[5];

		System.out.print("Please enter 5 elements for Array 1: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.print("Please enter 5 elements for Array 2: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("Prinintng elements in order below: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " " + arr2[i]);
		}
	}

	public static void Sum() {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int[] arr = new int[5];

		System.out.print("Please enter 5 elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count += arr[i];
		}
		
		System.out.println("Sum of all the elements of the array is: "+ count);
	}

	public static void main(String[] args) {
		System.out.println("Pattern: ");
		Pattern();

		System.out.println("Sum: ");
		Sum();

	}

}
