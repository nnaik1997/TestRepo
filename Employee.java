package StaticTest;

public class Employee {
	
	//AS company variable is common and if there are huge number of employees whose company is same so in this case we can make the variable as static
	
	public int empId;
	public String empName;
	public static String company ="LTI";
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public void display() {
		System.out.println(empId+" "+empName+" "+company);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Nikita");
		e1.display();
		Employee e2 = new Employee(102,"Manas");
		e2.display();
		
		
	}

}
