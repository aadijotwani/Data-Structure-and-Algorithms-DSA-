package operations1;
import java.util.ArrayList;

public class GetSetAdd {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		list.set(4	, 30);
		System.out.println(list);
		

	}

}
