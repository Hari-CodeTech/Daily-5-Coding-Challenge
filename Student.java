package com.ClassAndObjectTask;

public class Student {
	static {
		System.out.println("Student Management System Started");
		
	}
	{
		System.out.println("Student Object Created");
	}
	int id;
	String name;
	String course;
	

	public static void main(String[] args) {
		Student stunum1=new Student();
		stunum1.id=101;
		stunum1.name="Ravi";
		stunum1.course="Java";
		
		Student stunum2=new Student();
		stunum2.id=102;
		stunum2.name="Priya";
		stunum2.course="Python";
		
		System.out.println("Student 1");
		System.out.println(stunum1.id);
		System.out.println(stunum1.name);
		System.out.println(stunum1.course);
		
		System.out.println();
		System.out.println("Student 2");
		System.out.println(stunum2.id);
		System.out.println(stunum2.name);
		System.out.println(stunum2.course);
	}

}
