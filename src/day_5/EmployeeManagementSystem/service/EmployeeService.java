package day_5.EmployeeManagementSystem.service;

import java.util.ArrayList;

import day_5.EmployeeManagementSystem.model.Employee;

public class EmployeeService {
	
	ArrayList<Employee>employees=new ArrayList<>();

	
	public void addEmployee(Employee employee) {
	    employees.add(employee);
	    System.out.println("Employee added successfully.");
	}
	
	public void displayEmployee() {
		for (Employee employee : employees) {
			employee.displayInfo();
			System.out.println("----------------");
		}
	} 
	
	public void searchEmployeeById(int id) {
		boolean found = false;
		for(Employee employee : employees) {
			if(employee.getId()==id) {
				found = true;
				employee.displayInfo();
				break;
			}
		}
		if(!found) {
			System.out.println("Employee not found!!!");
		}
	}
	
	
	public void updateEmployeeById(int id,String newName, String newEmail, double newSalary, 
			String newDepeartment , int newTeamSize,String newprogramminglanguage, int newExpericence) {
		boolean found = false;
		for(Employee employee : employees) {
			if(employee.getId()==id) {
				found = true;
				employee.setName(newName);
				employee.setEmail(newEmail);
				employee.setSalary(newSalary);
				System.out.println("Employee Updated Successfully...");
				break;
			}
		}
		
		if(!found) {
			System.out.println("Employee not found!!!");
		}
	}
	
	public void deleteEmployeeById(int id) {
	    boolean found = false;
	    Employee employeeToDelete = null;

	    for(Employee employee : employees) {
	        if(employee.getId() == id) {
	            found = true;
	            employeeToDelete = employee;
	            break;
	        }
	    }

	    if(found) {
	        employees.remove(employeeToDelete);
	        System.out.println("Employee Deleted Successfully...");
	    }
	    else {
	        System.out.println("Employee not found!!!");
	    }
	}
	
}
