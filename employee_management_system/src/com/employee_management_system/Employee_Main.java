package com.employee_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//User Layer
public class Employee_Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		List<Employee> li = new ArrayList<Employee>();
		String st = "-------Employee Management System-------";
		Employee_Bussiness.animateString(st);
		if (Employee_Bussiness.logIn()) {
			System.out.println("Login Successfull...");
			while (true) {
				System.out.println("Select an Operation");
				System.out.println("1. Add an Employee");
				System.out.println("2. Remove an Employee");
				System.out.println("3. Update an Employee Details");
				System.out.println("4. Read all Employee Details");
				System.out.println("5. Logout");
				int choice = Employee_Validation.nextInt();
				switch (choice) {
				case 1: {
					Employee e = Employee_Bussiness.addEmployee();
					li.add(e);
					Employee_Bussiness.store(li);
					Employee_Bussiness.animateString("Employee Added Successfull....");
				}
					break;
				case 2: {
					li = Employee_Bussiness.retive();
					Employee_Bussiness.removeEmployee(li);
				}
					break;
				case 3: {
					li = Employee_Bussiness.retive();
					Employee_Bussiness.updateEmployee(li);
				}
					break;
				case 4: {
					li = Employee_Bussiness.retive();
					Employee_Bussiness.readAllEmployeeDetails(li);
				}
					break;
				case 5: {
					Employee_Bussiness.animateString("Logout Successfull....");
					System.exit(0);
				}
					break;
				default:
					System.out.println("Invalid Choice..");
				}
			}
		} else
			System.out.println("Invalid OTP...\nPlease try again...");

	}

}
