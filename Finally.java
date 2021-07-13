package exceptionHandling;

public class Finally {
	
	//finally block is executed always, whether the exception is handled or not.
	//try catch finally comes together, try finally can also come together
	//execution of these blocks ==> if exception occurs then try then catch and then finally
	//if exception doesnt occur then try and then finally

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a =100, b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block...!");
		}
	}

}
