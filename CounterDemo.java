package StaticTest;

public class CounterDemo {
	
	
	static int count = 0;
	
	public CounterDemo() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Previous count is =====> "+count);
		count ++;
		System.out.println("Current count is =====> "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterDemo c1 = new CounterDemo();
		CounterDemo c2 = new CounterDemo();
		CounterDemo c3 = new CounterDemo();
		
	}

}
