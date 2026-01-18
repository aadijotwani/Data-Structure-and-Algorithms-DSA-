package selectionSort;

public class DigitSumSort {

	public static int sum(int num, int s) {
		if (num > 0) {
			s += (num % 10);
			num /= 10;
			return sum(num, s);
		}
		return s;
	}
	
	public static int digitCount(int num) {
		int digit = 0;
		while(num > 0) {
			num /= 10;
			digit++;
		}
		return digit;
	}

	public static void main(String[] args) {

		int[] arr = { 21, 35, 62, 13, 46, 23, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			int s = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (sum(arr[j], 0) < sum(arr[s], 0)) {
					s = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[s];
			arr[s] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n"+digitCount(123));
	}
}
