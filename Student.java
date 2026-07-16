package com.Methods;
import java.util.*;
public class Student {
	Scanner sc=new Scanner(System.in);
	int total;
	double average;
	char Grade;
	int java; int mysql; int aptitude ;int english ; int softSkills;
	
	public void  acceptMarks(int java, int mysql, int aptitude ,int english , int softSkills){
		System.out.println("The 5 subject marks were imported");
		this.java=java;
		this.mysql=mysql;
		this.aptitude=aptitude;
		this.english=english;
		this.softSkills=softSkills;
		
	}
	public void calculateTotal(){
		System.out.println("Total marks of this 5 Subjects  are : "+" ");
		total=java+ mysql + aptitude +english + softSkills;
		System.out.println(total);
	}
	public void calculateAverage() {
		System.out.println("Average of the Total: "+" ");
		average=total/5.0;
		System.out.println(average);
		
	}
	public void findGrade() {
		System.out.println("Grade of the total:"+" ");
		if(average>=90) {
			System.out.println('A');
		}
		else if(average>=80) {
			System.out.println('B');
		}
		else if(average>=70) {
			System.out.println('C');
		}
		else if(average>=60) {
			System.out.println('D');
		}
		else {
			System.out.println("Fail");
		}
	}
	public void displayResult() {

	    System.out.println("\n===== STUDENT RESULT =====");

	    System.out.println("Java Marks        : " + java);
	    System.out.println("MySQL Marks       : " + mysql);
	    System.out.println("Aptitude Marks    : " + aptitude);
	    System.out.println("English Marks     : " + english);
	    System.out.println("Soft Skills Marks : " + softSkills);

	    System.out.println("-----------------------------");

	    System.out.println("Total Marks       : " + total);
	    System.out.println("Average           : " + average);
	    System.out.println("Grade             : " + Grade);

	    System.out.println("=============================");
		
	}

	public  static void main(String[] args) {
		Student s=new Student();
		s.acceptMarks(90,88,76,99,98);
		s.calculateTotal();
		s.calculateAverage();
		s.findGrade();
		s.displayResult();
		

	}

}
