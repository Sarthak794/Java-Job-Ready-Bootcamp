package day_5.OOPPractice;

public class Dog extends Animal{
	
	public void barking() {
		System.out.println("Dog is barking...");
	}
	
	@Override
	public void eating() {
		System.out.println("Dog is eating...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a2 = new Dog();
		a2.eating();
	}

}
