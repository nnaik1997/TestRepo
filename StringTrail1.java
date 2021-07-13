package stringTest;

public class StringTrail1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= new String("Nikita");
		
		String s2 =s1.concat(" Naik");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String demo ="hello";
		demo="byee";
		System.out.println(demo);
		System.out.println("hello".hashCode());
		System.out.println("byee".hashCode());
		
		StringBuffer demo1 = new StringBuffer("Hello");
		System.out.println(demo1);
		demo1 = new StringBuffer("Byee");
		System.out.println(demo1);

	}

}
