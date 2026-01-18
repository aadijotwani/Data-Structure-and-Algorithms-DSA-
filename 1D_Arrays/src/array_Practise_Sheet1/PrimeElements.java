package array_Practise_Sheet1;

public class PrimeElements {

	public static void main(String[] args) {

		int count, n = 0;
		int[] arr = new int[] { 11, 22, 33, 41, 59 };

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = 1; j < arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.println("Prime Number Detected");
				n++;
			}
		}

		int[] newarr = new int[n];
		n = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = 1; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				newarr[n] = arr[i];
				n++;
			}
		}

		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}

	}

}
