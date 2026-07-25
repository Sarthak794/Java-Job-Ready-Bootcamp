package day_8;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("C++");
		set.add("HTML");
		set.add("Java");
		
		System.out.println("Before Remove : "+set);
		
		boolean removed =set.remove("HTML");
		System.out.println("After Remove : "+set);
		System.out.println("Removed: "+removed);
		
		System.out.println("Does set contain Java: "+set.contains("Java"));
		System.out.println("Does set contain Phython: "+set.contains("Phython"));
		
		
		System.out.println("Size of Set: "+set.size());
		set.clear();
		System.out.println("Is Set Empty: "+set.isEmpty());

	}

}
