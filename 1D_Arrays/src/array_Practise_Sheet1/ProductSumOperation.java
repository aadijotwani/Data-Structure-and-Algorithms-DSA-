package array_Practise_Sheet1;

public class ProductSumOperation {

	public static void Operation(int[] arr1, int[] arr2) {

		int[] sum = new int[arr1.length];
		int[] product = new int[arr1.length];

		if (arr1.length >= arr2.length) {

			for (int i = 0; i < arr1.length; i++) {

				sum[i] = (i < arr2.length) ? arr1[i] + arr2[i] : arr1[i];
				product[i] = (i < arr2.length) ? arr1[i] * arr2[i] : arr1[i];
			}

		}

		else {

			for (int i = 0; i < arr2.length; i++) {

				sum[i] = (i < arr1.length) ? arr1[i] + arr2[i] : arr2[i];
				product[i] = (i < arr1.length) ? arr1[i] * arr2[i] : arr2[i];
			}

		}
		System.out.print("Sum array = ");
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + " ");
		}

		System.out.print("\nProduct Array = ");
		for (int i = 0; i < sum.length; i++) {
			System.out.print(product[i]+" ");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[] { 1, 2, 3 };

		Operation(arr1, arr2);
	}

}
