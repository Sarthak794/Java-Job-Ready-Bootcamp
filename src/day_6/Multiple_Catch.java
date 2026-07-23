package day_6;

import java.util.Scanner;

public class Multiple_Catch {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements for Array :");
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		try {
			int num;
			System.out.println("Enter the index of array :");
			i= sc.nextInt();
			System.out.println("Enter the number to divide :");
			num= sc.nextInt();
			int result = arr[i]/num;
			System.out.println("Result ="+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception!");
			System.out.println(e);
			System.out.println("Can't be divided by zero..");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Execption!");
			System.out.println(e);
			System.out.println("Enter the valid array index!!");
		}
		sc.close();
	}

}
