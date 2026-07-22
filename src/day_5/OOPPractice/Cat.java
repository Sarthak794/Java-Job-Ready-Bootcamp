package day_5.OOPPractice;

public class Cat extends Animal {
	
	@Override
	public void eating() {
		System.out.println("Cat is eating...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Cat();
		a1.eating();

	}

}
