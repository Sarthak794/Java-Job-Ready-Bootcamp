package day_8;
import java.util.*;

public class HashSet_Iterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("HTML");
		
		System.out.println("Using for :");
		for(String lang: set) {
			System.out.println(lang);
		}
		System.out.println("");
		System.out.println("Using Iterators : ");
		Iterator<String>it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Using forEach(): ");
		 set.forEach(language -> System.out.println(language));

	}

}
