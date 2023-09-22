package com.gentech.inheritancedemo;
class student
{
	student(String firstname,int age)
	{
		System.out.println("firstname:"+firstname);
		System.out.println("age:"+age);
	}
}
class library extends student
{
	String bookname;
	library(String fn,int age, String bookname)
	{
		super(fn,age);
		this.bookname=bookname;
		System.out.println("bookname:"+bookname);
	}
}
class dept extends library
{
	int deptid;
	dept(String fn,int age,String bookname,int deptid)
	{
		super(fn,age,bookname);
		this.deptid=deptid;
		System.out.println("department id:"+deptid);
	}
}
public class MultilevelSuperDemo {
	public static void main(String[] args) {
		library o1=new library("santosh",21,"core java");
		System.out.println("--------------------------------------");
		library o2=new library("Richard",32,"python");
		System.out.println("--------------------------------------");
		dept o3=new dept("priya",21,"html",101);
	}

}
