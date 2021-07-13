package stringTest;

public class StringTrail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Nikita");
		String s2="Nikita";
		
		boolean s = s1.equals(s2);
		System.out.println(s);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		if(s1==s2) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are unequal");
		}

	}

}
