package StaticTest;

public class StaticMethods {

	public void display() {
		System.out.println("This is a non static method which can be accessed by creating object of this class..!");
	}

	public static void show() {
		System.out.println("This is a static method which can be accessed from the className..!");
	}

	// within the class we dont need class name , but if there are multiple classes  then we need to mention the class name to access the static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here also memory management is taken care
		//as with static we dont create objects but methods are called directly , this helps to enhancethe speed of the application
		
		StaticMethods s = new StaticMethods();
		s.display();
		show();

	}

}
