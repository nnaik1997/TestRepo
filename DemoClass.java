package CollectionsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection
		
		Collection c = new ArrayList();
		c.add("Nikita");
		c.add(24);
		c.add(5.5f);
		System.out.println(c);
		
		//to fetch the values from a Collection, we use 2 things ==> 1. Iterator 2. Enhanced For Loop
		
		Iterator i = c.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		//Instead of writing the sop 3 times , we can use a loop i.e. 
		System.out.println("===============================================");
		Iterator i1 = c.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}

		//enhanced for loop ==used to iterate over an collection
		
		System.out.println("Enhanced for loop output : =========>");
		for(Object o : c) {
			System.out.println(o);
		}

		//---------------------------------------------------------------------------------------
		//Generics
		System.out.println("===============================================================================");
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(12);
		values.add(98);
		
		//to remove an element from a collection we use remove keyword
		
		//values.remove(98);
		//values.add(5.5f);
		//values.add("Nikita");
		System.out.println(values);
		
		//to fetch the values from the collection we use loops
		//here we can use int/Integer anything can do in enhanced for loop in assignment variable
		for (Integer v : values) {
			System.out.println(v);
		}
	}

}
