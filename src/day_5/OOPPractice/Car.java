package day_5.OOPPractice;

public class Car extends Vehicle {
	public void Company() {
		System.out.println("Calling Company method...");
	}
	public static void main(String[] args) {
		
		Car c = new Car();
		c.Start();
		c.Stop();
		c.Company();

	}

}
