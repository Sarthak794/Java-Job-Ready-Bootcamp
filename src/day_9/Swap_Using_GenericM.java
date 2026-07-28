package day_9;

import java.util.Arrays;

public class Swap_Using_GenericM {
	
	public static <T> void swap(T[] array, int i, int j) {

	    T temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}

	public static void main(String[] args) {
		String[] lang = {"Java", "Python", "C++"};
		Integer[] numbers = {10, 20, 30, 40};
		swap(lang, 0, 2);
		
		System.out.println(Arrays.toString(lang));
		
		swap(numbers, 0, 3);
		System.out.println(Arrays.toString(numbers));
		
		
		
	}

}
