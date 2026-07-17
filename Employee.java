package com.ClassAndObjectTask;

public class Employee {
	static String companyName="ABC Technologies";
	static {
		//String companyName="ABC Technologies";
		
		System.out.println("Company Information Loaded");
		
		
	}
	{
		System.out.println("Employee Object Created");
	}
	int empId;
	String empName;
	int salary;
	//public class Main{
	public static void main(String[] args) {
		Employee emp1=new Employee();
		
		emp1.empId=101;
		emp1.empName="Rahul";
		emp1.salary=45000;
		
		Employee emp2=new Employee();
		
		emp2.empId=102;
		emp2.empName="Sneha";
		emp2.salary=52000;
		
		Employee emp3=new Employee();
	
		emp3.empId=103;
		emp3.empName="Arjun";
		emp3.salary=60000;
		
		System.out.println("\nCompany :"+Employee.companyName);
		System.out.println("Employee 1");
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.salary);
		System.out.println();
		System.out.println("Employee 2");
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.salary);
		System.out.println();
		System.out.println("Employee 3");
		System.out.println(emp3.empId);
		System.out.println(emp3.empName);
		System.out.println(emp3.salary);
	
	}
	}
