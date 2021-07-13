package exceptionHandling;

import java.io.FileInputStream;

public class Checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class.forName("com.mysql.jdbc.Driver");
		/* if we put this above line as is, without try catch, compiler immediately reports an compile time error--inshort checked exception(compile try exception) */
		
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
			//this at compile time checks if some file is present and reports to us that this might show us some exception
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
