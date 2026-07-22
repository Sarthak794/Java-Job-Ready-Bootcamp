package day_5.OOPPractice;

public class Vehicle {
	
	public void Start() {
		System.out.println("Vehicle is Starting...");
	}
	public void Stop() {
		System.out.println("Vehicle is Stopping...");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.Start();
		v.Stop();
	}

}
