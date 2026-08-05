package day_9.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[]args) {
		Predicate<Integer> positive = num -> num>0;
		System.out.println(positive.test(100));
		System.out.println(positive.test(-100));
	}

}
