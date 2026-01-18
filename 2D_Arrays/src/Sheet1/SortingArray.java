package Sheet1;

import java.util.Scanner;

public class SortingArray {

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Sort_Row(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[0].length - 1; k++) {
				for (int j = 0; j < arr[0].length - 1; j++) {
					if (arr[i][j] > arr[i][j + 1]) {
						int temp = arr[i][j + 1];
						arr[i][j + 1] = arr[i][j];
						arr[i][j] = temp;
					}
				}
			}
		}
		printArray(arr);
	}

	public static void Sort_Column(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {
			for (int k = 0; k < arr.length - 1; k++) {
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i][j] > arr[i + 1][j]) {
						int temp = arr[i+1][j];
						arr[i+1][j] = arr[i][j];
						arr[i][j] = temp;
					}
				}
			}
		}
		printArray(arr);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Rows: ");
		int r = sc.nextInt();
		System.out.print("No. of Columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		System.out.println("Please enter the elements of the array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		Sort_Row(arr);
		System.out.println();
		Sort_Column(arr);

	}
}
