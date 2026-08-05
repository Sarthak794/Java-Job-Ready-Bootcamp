package day_9.FunctionalInterface;

import java.util.function.Function;

public class FunctionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> Cube= num -> num*num*num;
		
		System.out.println(Cube.apply(5));

	}

}
