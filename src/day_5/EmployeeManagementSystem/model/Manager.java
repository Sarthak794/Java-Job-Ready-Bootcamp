package day_5.EmployeeManagementSystem.model;

public class Manager extends Employee{
	
	private String department;
	private int teamsize;
	public Manager(int id, String name,String email,double salary,String department, int teamsize) {
		super(id,name,email,salary);
		this.department = department;
		this.teamsize = teamsize;
	}
	
	@Override
	public void displayInfo() {
	    super.displayInfo();
	    System.out.println("Department: " + getDepartment());
	    System.out.println("Team Size: " + getTeamsize());
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

}
