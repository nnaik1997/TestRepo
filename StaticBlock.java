package StaticTest;

public class StaticBlock {
	
	//static blocks-- static keyword with braces
	//how do we call a method?
	//We call a method by creating the object of the class and calling that method with that object
	
	//How is a static block called?
	//Static block executes automatically when the class is loaded in the  memory
	// Till java version 1.6, static blocks used to get executed even in absence of main method,
	//but later static blocks needs main method and irrespective of main method being first or last, static block executes first...
	//Irrespective of the arrangement, all the static members are scanned from top to bottom, identified, executed (variables +blocks) and then the o/p is printed..
	
	//uses
	/*static block is executed at class loading , hence at the time of class loading , if we want to perform any activity
	, we need to define that inside the static block... eg. Native methods-whose code is in diff language*/
	
	//static block is used to initialize the static members
	
	
	static {
		System.out.println("Hello , i am in static block-1..!");
	}

	/*static {
		System.out.println("Hello , i am static block 1..!");
		//System.exit(0);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello , i am main.....!");

	}

	static {
		System.out.println("Hello , i am  in static block-2..!");
	}

}
