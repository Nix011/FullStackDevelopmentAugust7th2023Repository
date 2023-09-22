package com.gentech.inheritancedemo;
class student1
{
	student1(String firstname,int age)
	{
		System.out.println("firstname:"+firstname);
		System.out.println("age:"+age);
	}
}
class library1 extends student1
{
	String bookname;
	String authorname;
	library1(String fn,int age,String bookname,String authorname)
	{
		super(fn,age);
		this.authorname=authorname;
		this.bookname=bookname;
		System.out.println("book name:"+bookname);
		System.out.println("author name:"+authorname);
		
	}
}
class dept1 extends library1
{
	String deptname;
	int deptid;
	dept1(String fn,int age,String bookname,String authorname,String deptname,int deptid)
	{
		super(fn,age,bookname,authorname);
		this.deptname=deptname;
		this.deptid=deptid;
		System.out.println("deptname:"+deptname);
		System.out.println("deptid:"+deptid);
	}
}
public class MultilevelinstanceDemo {
	public static void main(String[] args) {
		library1 o1=new library1("santosh",21,"core java","abc");
		System.out.println("--------------------------------------");
		dept1 o2=new dept1("richard",32,"python","xyz","cs",101);
	}

}
