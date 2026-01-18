package array_Practise_Sheet2;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int k;
		System.out.print("Please enter number to rotate the array accordingly: ");
		k = sc.nextInt();

		for(int j=0; j<k; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				int temp = arr[i];
				arr[i] = arr[arr.length-1];
				arr[arr.length-1] = temp; 
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
