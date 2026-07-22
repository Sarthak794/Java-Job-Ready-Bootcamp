package day_5.OOPPractice;

public class Rectangle extends Shapes{
	
	@Override
	public void sides() {
		System.out.println("Rectangle has four sides");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1= new Rectangle();
		s1.sides();

	}

}
