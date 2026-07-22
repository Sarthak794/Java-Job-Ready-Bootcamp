package day_5.EmployeeManagementSystem.model;

public class Developer extends Employee {

	private String programminglanguage;
	private int expericence;
	public Developer(int id,String name,String email,double salary, String programminglanguage, int expericence) {
		super(id, name, email, salary);
		this.programminglanguage = programminglanguage;
		this.expericence = expericence;
		
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programminglanguage: " +getProgramminglanguage());
		System.out.println("Experience: "+getExpericence());
	}
	
	public String getProgramminglanguage() {
		return programminglanguage;
	}
	public void setProgramminglanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}
	public int getExpericence() {
		return expericence;
	}
	public void setExpericence(int expericence) {
		this.expericence = expericence;
	}
	
}
