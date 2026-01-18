package operations1;

import java.util.ArrayList;

public class Removal {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		list.remove(0);
		list.remove(3);
		System.out.println(list.reversed());
		System.out.println(list.size());
		
	}

}
