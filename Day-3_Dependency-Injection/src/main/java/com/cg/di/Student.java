package com.cg.di;

//1. Dependency in terms of literals
public class Student 
{
	//variable
	private String StudentName;
	private int rollno;
	
	
	//DI using constructor
	//constructor name should pass in beans .xml
	public Student(String studentName, int rollno) {
		super();
		StudentName = studentName;
		this.rollno = rollno;
	}
	

	/*//DI Using getters and setters method
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getRollNo() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	} */
	
	//user defined method
	public void display()
	{
		System.out.println("Student Name is: "+StudentName+ "\n Student Roll No: "+rollno);
	}

	

}
