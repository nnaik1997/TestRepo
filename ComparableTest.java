package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> p = new ArrayList<>();
		p.add(new Person(1,26));
		p.add(new Person(2,86));
		p.add(new Person(3,46));
		p.add(new Person(4,66));
		p.add(new Person(5,6));

		Collections.sort(p);
		
		for (Person p1: p) {
			System.out.println(p1);
		}
	}

}

class Person implements Comparable<Person>{
	 int rollNo;
	 int marks;
	
	public Person(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Person [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Person o) {

		
		return this.marks > o.marks ? -1 : this.marks < o.marks ? 1 : 0;
	}
	
	
	
	
}