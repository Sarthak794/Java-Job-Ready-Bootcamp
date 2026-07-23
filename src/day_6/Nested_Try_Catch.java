package day_6;

import java.util.Scanner;

public class Nested_Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30};
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index :");
		int i =sc.nextInt();
		try {
			num = arr[i];
			System.out.println(num);
			
			try {
				int result = 10/num;
//				System.out.println("Result = "+result);
				
			}
			catch(ArithmeticException e) {
				System.out.println("Exception!");
				System.out.println(e);
				System.out.println("Number cannot be divided by zero..");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!");
			System.out.println(e);
			System.out.println("Enter the valid index ");
		}
		sc.close();
	}

}
