package day_9.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("----STREAM-----");
		//stream
		List<String> names =Arrays.asList("Sarthak","Kartik","Tejas");
		names.stream();
		names.forEach(System.out::println);
		
		
		System.out.println("----FILTER----");
		//filter
		List<Integer> num = Arrays.asList(10,30,50,40,60,20);
		num.stream()
		.filter(x-> x>25)
		.forEach(System.out::println);
		
		
		System.out.println("-----MAP-----");
		//map
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		System.out.println("----SORTED----");
		//sorted
		num.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("----DISTINCT----");
		//distinct
		num.stream()
		.distinct()
		.forEach(System.out::println);
		
		//limit
		System.out.println("----LIMIT----");
		num.stream()
	    .limit(3)
	    .forEach(System.out::println);
		
		
		//skip
		System.out.println("----SKIP----");
		num.stream()
		.skip(2)
		.forEach(System.out::println);
		
		
		//Count
		System.out.println("----Count----");
		long count =
				num.stream()
				    .filter(x -> x > 20)
				    .count();

				System.out.println(count);
				
		
		//first
		System.out.println("----First----");
		Optional<Integer> value =
			num.stream()
		    .findFirst();

			System.out.println(value.get());
	}


}
