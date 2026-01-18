package bubbleSort;
import java.util.Scanner;

public class KthLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 10, 20, 15, 30, 40 };
		boolean check = false;
		
		System.out.println("Please enter the the number: ");
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			check = false;
			for (int j = 1; j < k - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					check = true;
				}
			}
			if (check == false) {
				break;
			}
		}
			System.out.println("Kth Largest Element is:  "+arr[k-1]);
	}
}
