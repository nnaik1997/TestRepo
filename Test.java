package exceptionHandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.show();
	}
	

}

class E {
	public int show() {
		
		try {
			int a =2;
			return a;
		}
		catch(Exception e) {
			return 0;
		}
		finally {
			System.out.println("0");
		}
		
	}

}