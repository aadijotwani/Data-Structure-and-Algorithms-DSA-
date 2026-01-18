package Sheet2;

import java.util.Scanner;

public class Searching {

	public static void linearSearch(int[][] arr) {
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the element to search: ");
		int x = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (x == arr[i][j]) {
					System.out.println("Element found");
					check = true;
					break;
				}
			}
			
			if (check == true) {
				break;
			}
		}

		if (check == false) {
			System.out.println("Element Not found");
		}
	}

	public static boolean binarySearch(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the element to search: ");
		int target = sc.nextInt();

		int low = 0;
		int high = (arr.length * arr[0].length) - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			int row = mid / 2;
			int col = mid % 2;

			if (arr[row][col] == target) {
				return true;
			}

			else if (arr[row][col] < target) {
				low = mid + 1;
			}

			else if (arr[row][col] > target) {
				high = mid - 1;
			}
		}

		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. of rows: ");
		int r = sc.nextInt();
		System.out.print("Please enter the no. of columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];

		System.out.println("Please enter the elements of the arrary: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(binarySearch(arr));
	}

}
