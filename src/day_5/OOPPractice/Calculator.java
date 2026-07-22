package day_5.OOPPractice;

public class Calculator {

	public int  Add(int a, int b) {
		return a+b;
	}
	
	public int Add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double Add(double a , double b) {
		return a+b;
	}
	
	public float Add(float a, float b) {
		return a+b;
	}
	
	public double Add(int a, double b, float c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.Add(10, 20));
		System.out.println(c.Add(50, 60, 80));
		System.out.println(c.Add(50.0, 65.55));
		System.out.println(c.Add(50f, 90f));
		System.out.println(c.Add(60, 65.00, 80f));

	}

}
