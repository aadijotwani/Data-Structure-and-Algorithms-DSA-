package Sheet1;

import java.util.Scanner;

public class ArrayOperations {

	public static void Mult_10(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] * 10 + " ");
			}
			System.out.println();
		}

	}

	public static void Negative_Check(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < 0) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void SwapRow(int[][] arr) {
		int end = arr.length - 1;
		int i = 0;

		for (int j = 0; j < arr[i].length; j++) {
			int temp = arr[i][j];
			arr[i][j] = arr[end][j];
			arr[end][j] = temp;
		}

		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void SwapCol(int[][] arr) {
		int j = 0;
		int end = arr[0].length - 1;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i][j];
			arr[i][j] = arr[i][end];
			arr[i][end] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Rows: ");
		int r = sc.nextInt();
		System.out.print("No. of Columns: ");
		int c = sc.nextInt();

		int[][] matrix = new int[r][c];
		System.out.println("Please enter the elements of the array: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		Mult_10(matrix);
		System.out.println();
		Negative_Check(matrix);
		System.out.println();
		SwapRow(matrix);
		System.out.println();
		SwapCol(matrix);
	}
}
