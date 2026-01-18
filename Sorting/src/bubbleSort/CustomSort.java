package bubbleSort;

import java.util.Scanner;

public class CustomSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 9, 3, 7, 5, 8, 1 };
		boolean check = true;

		System.out.println("Please enter a number: ");
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			check = true;
			for (int j = 1; j < k - 1; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					check = false;
				}
			}
			if (check == true) {
				break;
			}

		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
