package day_2;
import java.util.Scanner;

public class Electricity_Bill {

	int unit;
	Scanner sc = new Scanner(System.in);
	
	void Calculate_Bill() {
		int rate = 50;
		System.out.println("Enter Total units used :");
		unit = sc.nextInt();
		if(unit>0) {
			int total_bill= rate*unit;
			System.out.println("Total Electric Bill : "+total_bill);
		}else {
			System.out.println("Electricity not used!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electricity_Bill p = new Electricity_Bill();
		p.Calculate_Bill();

	}

}
