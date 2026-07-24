package day_7;

import java.util.*;

public class Average_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(35);
		list.add(70);
		list.add(61);
		
		int sum = 0;
		for (int num : list) {
		    sum += num;
		}
		double average = (double)sum/list.size();
		System.out.println("Addition of ArrayList = "+sum);
		System.out.println("Average of ArrayList = "+average);

	}

}
