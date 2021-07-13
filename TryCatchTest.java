package exceptionHandling;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1");
		int a= 100, b=0,c;
		try {
		System.out.println("2");
		c=a/b;
		System.out.println("3");
		System.out.println(c);
		System.out.println("4");}
		catch(Exception e) {
			System.out.println("5");
			System.out.println(e);
			System.out.println("6");
		}
		System.out.println("Hello...........!");
	}

}
