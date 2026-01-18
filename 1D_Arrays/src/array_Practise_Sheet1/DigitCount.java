package array_Practise_Sheet1;

public class DigitCount {

	public static void main(String[] args) {
		
		int count, num;
		int[] arr = new int[] { 22, 309, 4, 55 };
		for (int i = 0; i < arr.length; i++) {
			count=1;
			num = arr[i];
			while (num / 10 != 0) {
				num = num/10;
				count++;
			}
			System.out.println("No. of digits in "+i+"th element is: "+count+" ");
		}

	}

}
