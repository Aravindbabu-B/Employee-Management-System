package com.employee_management_system;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Validation Layer.
public class Employee_Validation {

	public static Scanner sc = new Scanner(System.in);
	
	public static String generateId(String name) {
		Random r = new Random();
		char fc = name.charAt(0);
		char sc = name.charAt(1);
		char lc = name.charAt(name.length()-1);
		int rn = r.nextInt(999);
		
		String id = fc+""+sc+lc+rn;
		if(id.length()<6)
			id = id+"0";
		return id.toUpperCase();
	}
	
	public static long nextLong() {
		 long l = 0;
		while(true) {
			try {
				l=sc.nextLong();
				return l;
			}
			catch(InputMismatchException e) {
				System.out.println("Re-Enter valid input format");
				sc.next();
			}
		}
	}
	
	public static int nextInt() {
		int i = 0;
		while(true) {
			try {
				i=sc.nextInt();
				return i;
			}
			catch(InputMismatchException e) {
				System.out.println("Re-Enter valid input format");
				sc.next();
			}
		}
	}
	
	public static double nextDouble() {
		double d = 0;
		while(true) {
			try {
				d=sc.nextDouble();
				return d;
			}
			catch(InputMismatchException e) {
				System.out.println("Re-Enter valid input format");
				sc.next();
			}
		}
	}
	
	public static String validateName(String name) {
		while(true) {
			int count = 0;
			for(int i=0;i<=name.length()-1;i++) {
				char c = name.charAt(i);
				if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
					count++;
			}
			if(count==name.length())
				return name;
			else {
				System.out.println("Re-Enter Valid Name");
				name=sc.next();
			}
		}
	}
	
	public static int validateAge(int age) {
		while(true) {
			if(age>18)
				return age;
			else {
				System.out.println("Re-Enter valid age");
				age=sc.nextInt();
			}
		}
	}
	
	private static String reverse(String s) {
		String str = "";
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			str+=c;
		}
		return str;
	}
	
	private static String toLowerCase(String s) {
		String str = "";
		for(int i=0;i<=s.length()-1;i++){
			char c = s.charAt(i);
			if(c>='A'&&c<='Z')
				c=(char)(c+32);
			str+=c;
		}
		return str;
	}
	
	public static String validateEmailId(String email) {
		while(true) {
			if(email.length()>10) {
				email=toLowerCase(email);
				String s ="";
				int c = 0;
				for(int i=email.length()-1;c<=9;i--) {
					s+=email.charAt(i);
					c++;
				}
				if(reverse(s).equals("@gmail.com"))
					return email;
				else {
					System.out.println("Re-Enter Valid Email Id");
					email=sc.next();
				}
			}
			else {
				System.out.println("Re-Enter Valid Email Id");
				email=sc.next();
			}
		}
	}
	
	private static int count(long n) {
		int c = 0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}
	
	private static long firstDigit(long n) {
		long fd = n/1000000000;
		return fd;
	}
	
	public static long validateMobileNumber(long mobile) {
		while(true) {
			if(count(mobile)==10) {
				long fd = firstDigit(mobile);
				if(fd==9||fd==8||fd==7||fd==6)
					return mobile;
				else {
					System.out.println("Re-Enter valid Mobile Number");
					mobile=sc.nextLong();
				}
			}
			else {
				System.out.println("Re-Enter valid Mobile Number");
				mobile=sc.nextLong();
			}
		}
	}
	
	public static String validateType(String type) {
		while(true) {
			if(type.equalsIgnoreCase("Developer")||type.equalsIgnoreCase("Tester")
					||type.equalsIgnoreCase("HR")||type.equalsIgnoreCase("Admin")) {
				return type;
			}
			else {
				System.out.println("Re-Enter Valid Type.(Developer/Tester/Hr/Admin)");
				type=sc.next();
			}
		}
	}
	public static String validateDesignation(String designation) {
		while(true) {
			int count = 0;
			for(int i=0;i<=designation.length()-1;i++) {
				char c = designation.charAt(i);
				if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
					count++;
			}
			if(count==designation.length())
				return designation;
			else {
				System.out.println("Re-Enter Valid Name");
				designation=sc.next();
			}
		}
	}
	
	public static double validateSalary(double sal) {
		while(true) {
			if(sal>0) {
				return sal;
			}
			else {
				System.out.println("Re-Enter valid Salary");
				sal=sc.nextDouble();
			}
		}
	}
	
	public static double validateYop(double yop) {
		while(true) {
			if(yop>=0) {
				return yop;
			}
			else {
				System.out.println("Re-Enter valid YOP");
				yop=sc.nextDouble();
			}
		}
	}
}
