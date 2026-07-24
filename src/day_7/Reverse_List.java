package day_7;

import java.util.ArrayList;
import java.util.List;

public class Reverse_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		List<Integer>reversed = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Orignal ArrayList = "+list);
		for(int i=list.size()-1;i>=0;i--) {
			reversed.add(list.get(i));
		}
		System.out.println("Reversed ArrayList = "+reversed);

	}

}
