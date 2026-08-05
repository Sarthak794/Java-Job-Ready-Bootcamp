package day_9.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> CheckLength =str -> str.length()>0;
		
		System.out.println(CheckLength.test("Hello"));
		System.out.println(CheckLength.test(""));

	}

}
