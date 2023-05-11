package Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>(5);
		
		//Capacity of Vector
		System.out.println(vec.capacity());
		
		vec.add("Omkar");
		vec.add("Kalyani");
		vec.add("Anjali");
		vec.add("Akash");
		
		System.out.println(vec);
		
		
		vec.addElement("Abhi");
		vec.addElement("Nikita");
		
		System.out.println();
		
		System.out.println("Updated vector : " + vec);
		
		System.out.println("Size of Vector : " + vec.size() ); //6
		System.out.println("Capacity after adding elements :  " + vec.capacity()); //(5*2) = 10
		
		System.out.println();
		
		System.out.println("First Element : " + vec.firstElement());
		System.out.println("Last Element : " + vec.lastElement());
		
		System.out.println();
		//using contains you can check if the element is present or not
		if(vec.contains("Kalyani"))
		{
			System.out.println("Element present at index : " + vec.indexOf("Kalyani"));
		}
		else 
		{
			System.out.println("Element not present!!");
		}
	}
}
