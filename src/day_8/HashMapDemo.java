package day_8;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "HTML");
		map.put(3, "CSS");
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		
		System.out.println(map.containsKey(1));
		
		map.replace(2, "JavaScript");
		System.out.println(map);
		
		
		map.remove(3);
		System.out.println(map);
		
		for(Map.Entry<Integer, String>entry :map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
