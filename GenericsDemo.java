package CollectionsTest;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List values = new ArrayList();
		values.add(24);
		
		//so when we introduce the generics (Integer) then it doesnt acccept value of type String 
		//with help of generics we are getting the error at compile time itself , but if we try to parse this string to int , that error would be reflected at runtime which would be too late. 
		values.add("Nikita");
		
		//int i = Integer.parseInt(values.get(1).toString());
		System.out.println(values);
		
		Container<Integer> obj = new Container<>();
		//obj.value = "Nikita";
		obj.value = 10;
		obj.show();

	}

}

class Container<T extends Number>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
	
	
}