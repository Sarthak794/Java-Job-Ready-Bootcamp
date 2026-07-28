package day_9;

public class Box<T> {
	
	private T value;
	 public void setValue(T value) {
		 this.value = value;
		 
	 }
	 public T getValue() {
		 return value;
	 }
	 
	 public void diplayType() {
		 System.out.println(
		 value.getClass().getSimpleName()+ " : "+value
		 );
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1= new Box<>();
		box1.setValue("Java");
		box1.diplayType();
		
		Box<Integer> box2 = new Box<>();
		box2.setValue(100);
		box2.diplayType();
		
		Box<Double> box3= new Box<>();
		box3.setValue(99.9);
		box3.diplayType();

	}

}
