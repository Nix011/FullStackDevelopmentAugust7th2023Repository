package com.gentech.constructoroverloading;
class student
{
	student(String fname,String email)
	{
		System.out.println("student name:"+fname);
		System.out.println("student email:"+email);
	}
	student(int id)
	{
		System.out.println("student ID:"+id);
	}


}

public class StudentsDemo {

	public static void main(String[] args) {
		student o1=new student("Mahi","mahi@gmail.com");
		student o2=new student(1000);
	}

}
