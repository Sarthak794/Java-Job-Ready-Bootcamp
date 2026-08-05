package day_9.FunctionalInterface;

import java.util.function.Function;

public class FunctionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> String = str-> str.length();
		
		System.out.println(String.apply("Hello"));
		System.out.println(String.apply("Java Programming..."));

	}

}
