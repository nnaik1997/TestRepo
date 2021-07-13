package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//arranging the student data in descending order
//Comparator Example
public class CustomComparatorTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(1,26));
		stud.add(new Student(2,86));
		stud.add(new Student(3,46));
		stud.add(new Student(4,66));
		stud.add(new Student(5,6));

		Collections.sort(stud, (s1,s2) -> {
			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
		});
		
		for (Student s: stud) {
			System.out.println(s);
		}
	}

}

class Student{
	 int rollNo;
	 int marks;
	
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
	
	
}