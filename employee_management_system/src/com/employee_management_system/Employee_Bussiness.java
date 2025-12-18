package com.employee_management_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Business Layer / Logical Layer
public class Employee_Bussiness {

	static Scanner sc = new Scanner(System.in);

	public static void animateString(String st) throws InterruptedException {
		for (int i = 0; i <= st.length() - 1; i++) {
			System.err.print(st.charAt(i));
			Thread.sleep(40);
		}
		System.out.println();
	}

	public static int generateOTP() {
		Random r = new Random();
		int otp = r.nextInt(99999);
		return otp;
	}

	@SuppressWarnings("unused")
	public static boolean logIn() {
		System.out.println("Login to your Account");
		System.out.println("Enter the Mobile Number...");
		long mn = Employee_Validation.validateMobileNumber(Employee_Validation.nextLong());
		int genOtp = Employee_Bussiness.generateOTP();
		System.out.println("OTP Generated :- " + genOtp);
		System.out.println("Enter the OTP...");
		int enOtp = Employee_Validation.nextInt();
		return genOtp == enOtp;
	}

	public static Employee addEmployee() {
		System.out.println("Enter the Employee Name");
		String empName = Employee_Validation.validateName(sc.next());
		System.out.println("Enter the Employee Age");
		int empAge = Employee_Validation.validateAge(Employee_Validation.nextInt());
		System.out.println("Enter the Employee Email Id");
		String empEmail = Employee_Validation.validateEmailId(sc.next());
		System.out.println("Enter the Employee Mobile Number");
		long empMobileNo = Employee_Validation.validateMobileNumber(Employee_Validation.nextLong());
		System.out.println("Enter the Employee Tpye(Developer/Tester/HR/Admin");
		String empTyep = Employee_Validation.validateType(sc.next());
		System.out.println("Enter the Employee Designation");
		String empDesignation = Employee_Validation.validateDesignation(sc.next());
		System.out.println("Enter the Employee Salary");
		double empSalary = Employee_Validation.validateSalary(Employee_Validation.nextDouble());
		System.out.println("Enter the Employee Year's of Experience");
		double empyop = Employee_Validation.validateYop(Employee_Validation.nextDouble());

		return new Employee(empName, empAge, empEmail, empMobileNo, empTyep, empDesignation, empSalary, empyop);
	}

	public static void readAllEmployeeDetails(List<Employee> li) {
		if (li == null) {
			System.err.println("No Employee Exist...");
		} 
		else if (li.size() == 0)
			System.err.println("No Employee Exist...");
		else {
			System.err.println("=======All Employee Details=======");
			for (Employee e : li) {
				System.out.println(e);
				System.out.println("---------------------------------------------------------");
			}
		}
	}

	public static void removeEmployee(List<Employee> li) throws InterruptedException {
		if (li == null) {
			System.err.println("No Employee Exist...");
		} 
		else if (li.size() == 0)
			System.err.println("No Employee Exist...");
		else {
			System.out.println("Enter Employee Id");
			String empId = sc.next();
			int c0 = 0;
			for (int i = 0; i <= li.size() - 1; i++) {
				Employee e = li.get(i);
				if (e.getEmp_Id().equals(empId)) {
					li.remove(e);
					animateString("Employee Removed Successfull..");
					c0 = 1;
					store(li);
					break;
				}
			}
			if (c0 == 0)
				System.err.println("No Employee Exist to give Emp Id.");
		}
	}

	public static void updateEmployee(List<Employee> li) throws InterruptedException {
		if (li == null) {
			System.err.println("No Employee Exist...");
		} 
		else if (li.size() == 0)
			System.err.println("No Employee Exist...");
		else {
			boolean cond = true;
			while (cond) {
				System.out.println("Select which one to be Update");
				System.out.println("1. Emploee Email Id");
				System.out.println("2. Emploee Mobile Number");
				System.out.println("3. Emploee Designation");
				System.out.println("4. Emploee Salary");
				System.out.println("5. Emploee year of Exprience");
				System.out.println("6. Main Menu");
				int choic = sc.nextInt();
				switch (choic) {
				case 1: {
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					int c1 = 0;
					for (int i = 0; i <= li.size() - 1; i++) {
						Employee e = li.get(i);
						if (e.getEmp_Id().equals(empId)) {
							System.out.println("Enter New Email Id");
							String email = Employee_Validation.validateEmailId(sc.next());
							e.setEmp_EmailId(email);
							animateString("Updated Successfull....");
							c1 = 1;
							store(li);
							break;
						}
					}
					if (c1 == 0)
						System.err.println("No Employee Exist to give Emp Id.");
				}
					break;
				case 2: {
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					int c2 = 0;
					for (int i = 0; i <= li.size() - 1; i++) {
						Employee e = li.get(i);
						if (e.getEmp_Id().equals(empId)) {
							System.out.println("Enter New Mobile Number");
							long mobile = Employee_Validation.validateMobileNumber(Employee_Validation.nextLong());
							e.setEmp_mobileNo(mobile);
							animateString("Updated Successfull....");
							c2 = 1;
							store(li);
							break;
						}
					}
					if (c2 == 0)
						System.err.println("No Employee Exist to give Emp Id.");
				}
					break;
				case 3: {
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					int c3 = 0;
					for (int i = 0; i <= li.size() - 1; i++) {
						Employee e = li.get(i);
						if (e.getEmp_Id().equals(empId)) {
							System.out.println("Enter New Designation");
							String designation = Employee_Validation.validateDesignation(sc.next());
							e.setEmp_Designation(designation);
							animateString("Updated Successfull....");
							c3 = 1;
							store(li);
							break;
						}
					}
					if (c3 == 0)
						System.err.println("No Employee Exist to give Emp Id.");
				}
					break;
				case 4: {
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					int c4 = 0;
					for (int i = 0; i <= li.size() - 1; i++) {
						Employee e = li.get(i);
						if (e.getEmp_Id().equals(empId)) {
							System.out.println("Enter New Salary");
							double salary = Employee_Validation.validateSalary(Employee_Validation.nextDouble());
							e.setEmp_Salary(salary);
							animateString("Updated Successfull....");
							c4 = 1;
							store(li);
							break;
						}
					}
					if (c4 == 0)
						System.err.println("No Employee Exist to give Emp Id.");
				}
					break;
				case 5: {
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					int c5 = 0;
					for (int i = 0; i <= li.size() - 1; i++) {
						Employee e = li.get(i);
						if (e.getEmp_Id().equals(empId)) {
							System.out.println("Enter New year's of Exprience");
							double yop = Employee_Validation.validateYop(Employee_Validation.nextDouble());
							e.setEmp_YearOfExp(yop);
							animateString("Updated Successfull....");
							c5 = 1;
							store(li);
							break;
						}
					}
					if (c5 == 0)
						System.err.println("No Employee Exist to give Emp Id.");
				}
					break;
				case 6: {
					cond = false;
				}
					break;
				default:
					System.out.println("Invalid Choice....");
				}
			}
		}
	}

	public static void store(List<Employee> li) {
		try {
			FileOutputStream fos = new FileOutputStream("emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(li);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			System.err.println("File Not Exits");
		} catch (IOException e) {
			System.err.println("File Not Exits");
		}
	}

	public static List<Employee> retive() {
		try {
			FileInputStream fis = new FileInputStream("emp.txt");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Employee> l = (List<Employee>) (ois.readObject());
			return l;

		} catch (FileNotFoundException e) {
			System.err.println("File Not Exits");
		} catch (IOException e) {
			System.err.println("File Not Exits");
		} catch (ClassNotFoundException e) {
			System.err.println("File Not Exits");
		}
		return null;
	}
}
