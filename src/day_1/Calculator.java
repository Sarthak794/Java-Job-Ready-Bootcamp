package day_1;
import java.util.Scanner;

public class Calculator {

	int a, b;
	Scanner sc = new Scanner(System.in);
	public void Calculate() {
		System.out.println("Enter the numbers to perform Calculations:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter what operation you want to perform:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplycation");
		System.out.println("4.Division");
		int op =sc.nextInt();
		
		switch (op) {
		case 1: {
			int c = a+b;
			System.out.println("Addition ="+c);
			break;
		}
		case 2:{
			int c=a-b;
			System.out.println("Subtraction ="+c);
			break;
		}
		case 3: {
			int c = a*b;
			System.out.println("Multiplycation ="+c);
			break;
		}
		case 4:{
			int c = a/b;
			System.out.println("Division ="+c);
			break;
		}
		default:
			System.out.println("Enter valid Data!!!...");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ca = new Calculator();
		ca.Calculate();

	}

}
