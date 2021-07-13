package java8Features;

//this inner class is trying to give the implementation of interface,
//this interface is giving the method name, parameters and return type already below so we just need implementation i.e. Sopln here so we 
// just write this method () and this part belongs to -> 

//WHEN WE HAVE PARAMETERS, WE CAN PASS THOSE IN THE (), and if there is just one single parameter we can pass it without brackets.
//for eg. 		obj = i -> System.out.println("Hello Lambda Expressions..."); no need to mention the datatype as in methods we have mentioned the datatype


public class LambdaExpressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj = new A() { //Anonymous Inner Class
			/*public void show(int i) {
				System.out.println("Hello Lambda Expressions..."+i);
			}
		};
		obj.show(5);*/

		//lambda expression trial : as it is a single line -- we can eliminate the braces.
		
		A obj ;
		obj = i -> System.out.println("Hello Lambda Expressions..."+i);
		obj.show(5);

	}
}

interface A{
	void show( int i);
}

/*
 * class ABC implements A{
 * 
 * public void show(int i) { System.out.println("Hello ABC Project..!"+i); } }
 */