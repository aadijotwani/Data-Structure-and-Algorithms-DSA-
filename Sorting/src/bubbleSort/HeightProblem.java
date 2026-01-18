package bubbleSort;

public class HeightProblem {

	public static void main(String[] args) {
		String[] name = { "Alice", "Bob", "Mark" };
		int[] height = { 155, 185, 150 };
		boolean check = false;

		for (int i = 0; i < height.length; i++) {
			check = false;
			for (int j = 1; j < height.length - i; j++) {
				if (height[j] > height[j - 1]) {
					int temp = height[j];
					String tempString = name[j];

					height[j] = height[j - 1];
					name[j] = name[j - 1];

					height[j - 1] = temp;
					name[j - 1] = tempString;

					check = true;
				}
			}
			if (check = false) {
				break;
			}
		}
		
		System.out.print(name[0]+" is the tallest");
		for(int i=1; i<height.length; i++) {
			System.out.print(", followed by "+name[i]);
		}
	}

}
