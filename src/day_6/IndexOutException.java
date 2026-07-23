package day_6;

import java.util.Scanner;

public class IndexOutException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int arr[] = new int [5];
		System.out.println("Enter elements In Array :");
		for(i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		try {
			System.out.println("Enter the index : ");
			i = sc.nextInt();
			System.out.println("Element :"+arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught!");
			System.out.println(e);
		}
		sc.close();

	}

}
