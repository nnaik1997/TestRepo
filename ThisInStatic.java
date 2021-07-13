package StaticTest;

public class ThisInStatic {

	// how this keyword used in static..?
	//NEVER use this or super in static reference
	
	static int a =100;
	static void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("1111111");
		//ThisInStatic s = new ThisInStatic();
		display();
	}
}
