package Sheet2;

import java.util.Scanner;

public class OptimisedSearch {

	public static int[] search(int[][] arr, int target) {

		int m = arr.length;
		int n = arr[0].length;

		int r = 0, c = n - 1;
		while (r < m && c >= 0) {

			if (arr[r][c] == target) {
				return new int[] { r, c };
			}

			else if (arr[r][c] > target) {
				c--;
			}

			else {
				r++;
			}
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. of rows: ");
		int r = sc.nextInt();
		System.out.print("Please enter the no. of columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		System.out.println("Please enter the elements of the array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Please enter the element to search: ");
		int target = sc.nextInt();

		int[] result = search(arr, target);
		if (result[0] != -1 && result[1] != -1)
			System.out.println("Element found at index (" + result[0] + "," + result[1] + ")");
		else
			System.out.println("Element not Found");

	}

}
