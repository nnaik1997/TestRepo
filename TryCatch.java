package exceptionHandling;

/*an exception is an unwanted/unexpected event, which occurs during the execution of a program i.e. at runtime that disrupts the normal flow 
 of the program for eg. if in my schedule where i get up , getv ready and leave home to reach office but while travelling my bike gets 
 punctured, so this unexpected event that could delay my reaching to office can be termed as an exception*/
//finding alternate way to not disturb the normal flow of execution is exception handling

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println(100/0);
		//this line throws an arithmetic exception and all lines below this exception are skipped.
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");

	}

}
