package com.lti.pack1;

class Student
{
    int regId;
	
	void setData()
	{
		regId=1290;
	}
	void display()
	{
		System.out.println("The student registration Id is " + regId);
	}
}
public class StudentMain
{
	public static void main(String [] args)
	{
		Student stu=new Student();
		stu.setData();
		stu.display();	
	}
}



