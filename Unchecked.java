package exceptionHandling;

public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this might throw an exception , but still its not reported initially so its called unchecked exception(Runtime exception)
		
		int a=100, b= 0, c;
		c= a/b;
		System.out.println(c);
	}

}
