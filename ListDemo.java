package CollectionsTest;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(40);
		l.add(60);
		l.add(80);
		l.add(40);
		System.out.println(l);
		//removes the element by index
		l.remove(1);
		//l.remove(new Integer(20));
		System.out.println(l);
		
		/*List<int> a = new ArrayList<int>();
		a.add(1);
		a.add(2);
		
		System.out.println(a.get(0)+a.get(1));*/

	}

}
