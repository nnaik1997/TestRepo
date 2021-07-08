package CollectionsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[4];
		System.out.println(a.length);
		
		
		//here as no datatype is mentioned using generics, here all data types can be inserted and they are treated as Objects.
		Collection c = new ArrayList();
		c.add("Nikita");
		c.add(24);
		System.out.println(c);
		
		//HERE we can specify the datatype using generics. 
		Collection <Integer> c1 = new ArrayList<Integer>();
		//c1.add("Nikita"); this gives an error as it is the type of string 
		c1.add(24);
		System.out.println(c1);
		
		//List Demo
		//List prints in the order in which it is inserted.
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(18);
		l.add(15);
		l.add(1);
		l.add(18);
		l.add(100);
		
		System.out.println("List demo ====>"+l);
	
		//Set Demo
		//Set doesnt maintain the order in which is inserted
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(18);
		s.add(15);
		s.add(1);
		s.add(18);
		s.add(100);

		//TreeSet arranges the data inserted in asending order.
		Set<Integer> t = new TreeSet<Integer>();
		
		t.add(18);
		t.add(15);
		t.add(1);
		t.add(18);
		t.add(100);

		System.out.println("Set demo =====>"+s);
		System.out.println("TreeSet demo =====>"+t);

		

	}

}
