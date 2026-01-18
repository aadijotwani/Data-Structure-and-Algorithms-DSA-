package bubbleSort;

public class SwapCount {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 2 };
		boolean check = false;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			check = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					count++;
					check = true;
				}
			}
			if (check == false) {
				break;
			}
		}
		System.out.println("Min no. of swaps are: " + count);
	}
}
