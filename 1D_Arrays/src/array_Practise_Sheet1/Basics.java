package array_Practise_Sheet1;
import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5]; // declaration and creation;
		for(int i=0; i<arr.length; i++)// initialization
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
