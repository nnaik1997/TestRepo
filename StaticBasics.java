package StaticTest;

public class StaticBasics {
	
	static int a= 10; // static variables can be at class level and not at method level
	
	int b1() {
//		 static int b =20; // this is wrong as b is declared static at method level and would throw compilation error early
	    int b =20;
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Hello World...!");
 StaticBasics b = new StaticBasics();
 System.out.println(a);
 System.out.println(b.b1());
 //Static s1 = new Static();
 System.out.println(Static.s);
	}

}
//static variables can be at class level and not at method level
//this is wrong as b is declared static at method level and would throw compilation error early
//Static is with reference to class name and normal ones need objects to be created to be accessible
//So there comes an upper hand for static where objects dont need to be created and it helps in memory management more is clearly explained with employee and counter example
// if this variable is static, it can be accessed in another class by using the classname of this variable
//but if it is not static , it should be accessed by creating the object of this class otherwise if its accessed by the classname we would get compilation error(dont refer as static to non static)
//only static instance variables can be accessed by the static methods.
// if an instance variable is not static, it cant be accessed by static methods BUT
//static instance variable can be accessed by a non static methods.	Also this keyword can be used with static variable
//Non static method cannot be called from a static method
//if within the class, we can call the method directly.
// if from another class, then we need to call that method using their classname
//AS company variable is common and if there are huge number of employees whose company is same so in this case we can make the variable as static
// within the class we dont need class name , but if there are multiple classes  then we need to mention the class name to access the static method
//here also memory management is taken care
//as with static we dont create objects but methods are called directly , this helps to enhancethe speed of the application
