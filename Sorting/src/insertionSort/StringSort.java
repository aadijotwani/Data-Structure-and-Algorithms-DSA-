package insertionSort;

public class StringSort {

	public static void main(String[] args) {
		String[] str = { "banana", "appl", "kiwi", "pear", "orange" };
		boolean check = true;

		for (int i = 1; i < str.length; i++) {
			String key = str[i];
			int j = i - 1;
			int num = str[j].length();
			check = true;
			while (j >= 0 && num > key.length()) {
				if (key.length() == str[j].length()) {
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
					check = false;
				} else {
					str[j + 1] = str[j];
					j--;
				}
			}
			if (check == true) {
				str[j + 1] = key;
			}
		}

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

}
