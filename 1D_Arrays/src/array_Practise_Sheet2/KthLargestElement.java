package array_Practise_Sheet2;

import java.util.Scanner;
public class KthLargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 3, 2, 1, 5, 6, 4 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] >= arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Please enter the index of the nth largest element to find: ");
		int n = sc.nextInt();
		
		System.out.println(n+"th largest element = "+arr[arr.length-n]);

	}

}
