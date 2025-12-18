package com.employee_management_system;

import java.io.Serializable;

//Bean Class
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String emp_Id;
	private String emp_Name;
	private int emp_Age;
	private String emp_EmailId;
	private long emp_mobileNo;
	private String emp_Type;
	private String emp_Designation;
	private double emp_Salary;
	private double emp_YearOfExp;

	public Employee(String emp_Name, int emp_Age, String emp_EmailId, long emp_mobileNo, String emp_Type,
			String emp_Designation, double emp_Salary, double emp_YearOfExp) {
		this.emp_Name = emp_Name;
		this.emp_Age = emp_Age;
		this.emp_EmailId = emp_EmailId;
		this.emp_mobileNo = emp_mobileNo;
		this.emp_Type = emp_Type;
		this.emp_Designation = emp_Designation;
		this.emp_Salary = emp_Salary;
		this.emp_YearOfExp = emp_YearOfExp;
		this.emp_Id = Employee_Validation.generateId(emp_Name);
	}

	public String getEmp_Id() {
		return emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public int getEmp_Age() {
		return emp_Age;
	}

	public String getEmp_EmailId() {
		return emp_EmailId;
	}

	public long getEmp_mobileNo() {
		return emp_mobileNo;
	}

	public String getEmp_Type() {
		return emp_Type;
	}

	public String getEmp_Designation() {
		return emp_Designation;
	}

	public double getEmp_Salary() {
		return emp_Salary;
	}

	public double getEmp_YearOfExp() {
		return emp_YearOfExp;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}

	public void setEmp_EmailId(String emp_EmailId) {
		this.emp_EmailId = emp_EmailId;
	}

	public void setEmp_mobileNo(long emp_mobileNo) {
		this.emp_mobileNo = emp_mobileNo;
	}

	public void setEmp_Type(String emp_Type) {
		this.emp_Type = emp_Type;
	}

	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}

	public void setEmp_Salary(double emp_Salary) {
		this.emp_Salary = emp_Salary;
	}

	public void setEmp_YearOfExp(double emp_YearOfExp) {
		this.emp_YearOfExp = emp_YearOfExp;
	}

	@Override
	public String toString() {
		return "Employee Id : " + emp_Id + "\nEmployee Name : " + emp_Name + "\nEmployee Age : " + emp_Age
				+ "\nEmployee Email Id : " + emp_EmailId + "\nEmployee Mobile Number : " + emp_mobileNo
				+ "\nEmployee Type : " + emp_Type + "\nEmployee Designation :" + emp_Designation
				+ "\nEmployee Salary : " + emp_Salary + " LPA" + "\nEmployee Experience : " + emp_YearOfExp + " years";
	}

}