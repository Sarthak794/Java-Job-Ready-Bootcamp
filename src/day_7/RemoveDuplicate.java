package day_7;
import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);

		System.out.println("Original List : " + list);

		Set<Integer> set = new LinkedHashSet<>(list);

		System.out.println("Without Duplicates : " + set);

	}

}
