package StaticTest;

public class StaticDemo {
	
	//only static instance variables can be accessed by the static methods.
	// if an instance variable is not static, it cant be accessed by static methods BUT
	//static instance variable can be accessed by a non static methods.	Also this keyword can be used with static variable
	//Non static method cannot be called from a static method
	//if within the class, we can call the method directly.
	// if from another class, then we need to call that method using their classname
	
	
	
	static int i = 10;
	
	void display() {
		//view();
		System.out.println(i);
	}
	void view() {
		System.out.println("Non static method...!");
	}
public static void main(String[] args) {
	StaticDemo s = new StaticDemo();
	s.display();
	//Xyz x= new Xyz();
	Xyz.show();


}
}
class Xyz{
	static void show() {
		System.out.println("Hello, I am static method from another class ....!");
	}
}