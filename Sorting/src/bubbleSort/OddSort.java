package bubbleSort;

public class OddSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 8, 7, 6 };
		boolean check = false;
		int count = 0;


		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}

		int[] odd = new int[count];

		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd[t] = arr[i];
				t++;
			}
		}

		for (int i = 0; i < odd.length; i++) {
			check = false;
			for (int j = 1; j < odd.length - i; j++) {
				if (odd[j] < odd[j - 1]) {
					int temp = odd[j];
					odd[j] = odd[j - 1];
					odd[j - 1] = temp;
					check = true;
				}
			}
			if (check == false) {
				break;
			}
		}
		
		t=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = odd[t];
				t++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
