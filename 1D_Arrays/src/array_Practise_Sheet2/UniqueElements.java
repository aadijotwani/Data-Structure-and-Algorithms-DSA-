package array_Practise_Sheet2;

import java.util.Scanner;
public class UniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3, 2, 2, 1, 5, 6};   
		int count=0;
		boolean check;
		
		for(int i=0; i<arr.length; i++) {
			check = false;
			if(i>0) {
				for(int j=i-1; j>0; j--) {
					if(arr[i] == arr[j]) {
						check=true;
						break;
					}	
				}
			}
			if(check == false) {
				count++;
			}
			
		}
		
		System.out.println(count);
		

	}

}

