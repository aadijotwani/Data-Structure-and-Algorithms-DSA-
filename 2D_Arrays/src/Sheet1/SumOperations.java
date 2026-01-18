package Sheet1;

import java.sql.RowId;
import java.util.Scanner;

public class SumOperations {

	public static void Diag_Sum(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j || i + j == arr[i].length - 1) {
					count += arr[i][j];
				}
			}
		}
		System.out.println("The sum of the diagnol elements are: " + count);
	}

	public static void Sum_Row(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr[0].length; j++) {
				count += arr[i][j];
			}
			System.out.println(count);
		}
	}

	public static void Sum_Column(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr[0].length; j++) {
				count += arr[j][i];
			}
			System.out.println(count);
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

		Diag_Sum(matrix);
		System.out.println("\nRow Sum: ");
		Sum_Row(matrix);
		System.out.println("\nColumn Sum: ");
		Sum_Column(matrix);
	}

}
