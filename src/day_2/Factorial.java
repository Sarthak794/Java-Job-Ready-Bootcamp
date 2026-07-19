package day_2;

import java.util.Scanner;

public class Factorial {
	int fact=1;
	int n;
	Scanner sc = new Scanner(System.in);
	
	void Calculate() {
		System.out.println("Enter the number to check Factorial: ");
		n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial p = new Factorial();
		p.Calculate();

	}

}
