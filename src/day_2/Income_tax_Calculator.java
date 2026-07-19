package day_2;
import java.util.Scanner;

public class Income_tax_Calculator {
	
	void Calculate() {
		int income;
		int tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Annual Income :");
		income = sc.nextInt();
		
		if(income<250000) {
			System.out.println("NO Income tax for this Income...");
		}
		else if(income<600000 && income>250000) {
			tax=5*income/100;
			System.out.println(tax);
		}
		else if(income>600000) {
			tax=8*income/100;
			System.out.println(tax);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Income_tax_Calculator p = new Income_tax_Calculator();
		p.Calculate();

	}

}
