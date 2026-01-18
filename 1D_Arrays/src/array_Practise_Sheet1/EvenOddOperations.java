package array_Practise_Sheet1;

import java.util.Scanner;

public class EvenOddOperations {

	public static void EVENorOdd() {
		Scanner sc = new Scanner(System.in);
		int EvenCount = 0, OddCount = 0;
		int EvenSum=0, OddSum=0, EvenProduct=1, OddProduct=1;
		int[] arr = new int[] { 14, 9, 6, 20, 35 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				EvenCount++;
			else {
				OddCount++;
			}
		}

		int[] Evenarr = new int[EvenCount];
		int[] Oddarr = new int[OddCount];
		
		EvenCount = 0;
		OddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Evenarr[EvenCount] = arr[i];
				EvenCount++;
				EvenSum += arr[i];
				EvenProduct *= arr[i];
			}
			
			else {
				Oddarr[OddCount] = arr[i];
				OddCount++;
				OddSum += arr[i];
				OddProduct *= arr[i];
			}
		}
		
		System.out.println("Even Array: ");
		for (int i = 0; i < Evenarr.length; i++) {
			System.out.println(Evenarr[i] );
		}
		
		System.out.println("Odd Array: ");
		for (int i = 0; i < Oddarr.length; i++) {
			System.out.println(Oddarr[i]);
		}
		
		System.out.println("No. of Even elements of the array is: "+EvenCount);
		System.out.println("No. of Odd elements of the array is: "+OddCount);
		System.out.println("Sum of Even elements of the array is: "+EvenSum);
		System.out.println("Sum of Odd elements of the array is: "+OddSum);
		System.out.println("Product of Even elements of the array is: "+EvenProduct);
		System.out.println("Product of Odd elements of the array is: "+OddProduct);
	}
	
	

	public static void main(String[] args) {
		EVENorOdd();
	}

}
