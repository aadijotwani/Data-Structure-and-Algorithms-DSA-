package array_Practise_Sheet1;

import java.util.Scanner;

public class MinMaxElements {

	public static void main(String[] args) {
		
		int min, max, span;		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("Please enter the elemtns of the array :");		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		min = max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] <= min)
				min = arr[i];
			
			if(arr[i] >= max)
				max = arr[i];
		}
		
		span = max-min;
		
		System.out.println("Smallest Number in the array is : "+ min);
		System.out.println("Largest Number in the array is : "+max);
		System.out.println("Span of the array is : "+ span);

	}

}
