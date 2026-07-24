package day_7;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
//		Create an ArrayList of integers and print all elements.
		List<String>list = new ArrayList<>();
		
		
//		Add five names and display them
		list.add("Sarthak");
		list.add("Jay");
		list.add("Ajay");
		list.add("Vijay");
		list.add("Vinay");
		System.out.println("After adding elements :"+list);
		
		
//		Replace the third element using set().
		list.set(2,"Suraj");
		System.out.println("After set() :"+list);
		
		
//		Remove an element by index and by value.
		list.remove(2);
		list.remove("Vijay");
		System.out.println("After remove() :"+list);
		
		
//		Check if a specific element exists using contains().
		boolean b=list.contains("Sarthak");
		System.out.println("List Contains 'Sarthak' :"+b);
		
		System.out.println("Size :"+list.size());
		
		System.out.println("IsEmpty :"+list.isEmpty());
		
		System.out.println("Traversing List");
		for(String name:list) {
			System.out.println(name);
		}
	}

}
