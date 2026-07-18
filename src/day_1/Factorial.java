package day_1;
import java.util.Scanner;

public class Factorial {
	public void Display() {
		int a;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to gets it factorial of it: ");
		a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			fact *=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial di = new Factorial();
		di.Display();

	}

}
