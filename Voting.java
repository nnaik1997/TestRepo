package exceptionHandling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{

	public YoungerAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		try {
		if (age < 18) {
			throw new YoungerAgeException("You are not eligible for voting as the age is less than 18");
			//System.out.println("hello...");
		
		}
		else {
			System.out.println("Vote successfully....!");
		}
		}
		catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Hello Exception...!");

		
	}

}
