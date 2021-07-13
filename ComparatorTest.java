package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this sorts the elements in ascending order
		
		List<Integer> l = new ArrayList<>();
		l.add(208);
		l.add(905);
		l.add(603);
		l.add(181);
		l.add(124);
		Collections.sort(l);

		//Steam API for printing values:
		l.forEach(System.out::println);
        System.out.println("====================================================");
        
		//but if we want to add some logic to sorting ==> like sort on the basis of the last digit then use Comparator
		Comparator<Integer> com = new CompImpl();
		Collections.sort(l, com);
		System.out.println("Using comparator we are sorting the values on the basis of last digit");
		l.forEach(System.out::println);

		//anonymous class

        System.out.println("====================================================");		
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10 > o2%10) { 
					return 1;
				}
				return -1;
			}
		};

		Collections.sort(l, com1);
		System.out.println("Using comparator we are sorting the values on the basis of last digit=== Anonymous class");
		l.forEach(System.out::println);

		//lambda expressions
		
        System.out.println("====================================================");		
		Comparator<Integer> com2 = (o1,  o2) -> {
				return o1%100 > o2%100 ? 1:-1;
		};

		Collections.sort(l, com2);
		System.out.println("Using comparator we are sorting the values on the basis of last digit=== Lambda expression");
		l.forEach(System.out::println);
		
	}

}
