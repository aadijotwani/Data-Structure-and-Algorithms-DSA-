package mergeSort;

public class Sorting {
	// Divide method (Splitting the array)
	public static void divide(int[] array, int left, int right) {
		if (left < right) {
			// Find the middle point using a safe formula
			int mid = left + (right - left) / 2;

			System.out.print("Divide: ");
			printArray(array, left, right);

			// Recursively divide the array
			divide(array, left, mid); // Divide left half
			divide(array, mid + 1, right); // Divide right half

			// Conquer (Merge the sorted halves)
			conquer(array, left, mid, right);
		}
	}

	// Conquer method (Merging the array)
	public static void conquer(int[] array, int left, int mid, int right) {
		System.out.print("Conquer: ");
		printArray(array, left, right);

		// Sizes of the two subarrays
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temporary arrays
		for (int i = 0; i < n1; i++) {
			leftArray[i] = array[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = array[mid + 1 + j];
		}

		// Merge the temporary arrays
		int i = 0, j = 0, k = left; // Initial indices of subarrays and merged array

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of leftArray, if any
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy remaining elements of rightArray, if any
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}

		// Print array after merging
		System.out.print("After merging: ");
		printArray(array, left, right);
	}

	// Method to print an array from a specific range
	public static void printArray(int[] array, int left, int right) {
		for (int i = left; i <= right; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Main method
	public static void main(String[] args) {
		int[] array = { 6, 2, 11, 7, 5, 4 };

		System.out.println("Unsorted Array:");
		printArray(array, 0, array.length - 1);

		// Perform merge sort
		divide(array, 0, array.length - 1);

		System.out.println("\nSorted Array:");
		printArray(array, 0, array.length - 1);
	}
}
