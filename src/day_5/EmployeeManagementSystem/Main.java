package day_5.EmployeeManagementSystem;

import day_5.EmployeeManagementSystem.model.Developer;
import day_5.EmployeeManagementSystem.model.Employee;
import day_5.EmployeeManagementSystem.model.Manager;
import day_5.EmployeeManagementSystem.service.EmployeeService;

public class Main {

	public static Employee e1= new Employee(1,"Sarthak","ex@gmail.com",80000.00);
	public static Developer d1 = new Developer(2, "Vinay", "vinay@gmail.com", 60000.00, "Java", 0);
	public static Manager m1 = new Manager(3, "Surja", "suraj@gmail.com", 500000.00, "IT", 50);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService emp = new EmployeeService();
		
		emp.addEmployee(e1);
		emp.addEmployee(d1);
		emp.addEmployee(m1);
		
		emp.displayEmployee();
	} 

}
