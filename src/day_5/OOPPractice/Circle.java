package day_5.OOPPractice;

public class Circle extends Shapes{
	@Override
	public void sides() {
		System.out.println("Circle has Zero Sides");
		
	}


	public static void main(String[] args) {

		Shapes s2 = new Circle();
		s2.sides();
	}

	
}
