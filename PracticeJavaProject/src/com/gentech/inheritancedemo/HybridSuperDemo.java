package com.gentech.inheritancedemo;
class student2
{
	student2(String firstname,int age)
	{
		System.out.println("firstname:"+firstname);
		System.out.println("age:"+age);
	}
}
class library2 extends student2
{
	String bookname;
	String authorname;
	library2(String fn,int age,String bookname,String authorname)
	{
		super(fn,age);
		this.authorname=authorname;
		this.bookname=bookname;
		System.out.println("book name:"+bookname);
		System.out.println("author name:"+authorname);

	}
}
class dept2 extends library2
{
	String deptname;
	int deptid;
	dept2(String fn,int age,String bookname,String authorname,String deptname,int deptid)
	{
		super(fn,age,bookname,authorname);
		this.deptname=deptname;
		this.deptid=deptid;
		System.out.println("deptname:"+deptname);
		System.out.println("deptid:"+deptid);
	}
}
class sports2 extends student2
{
	int spid;
	String sportname;
	sports2(String fn,int age,int spid,String sportname)
	{
		super(fn,age);
		this.spid=spid;
		this.sportname=sportname;
		System.out.println("sports id:"+spid);
		System.out.println("sport name:"+sportname);
	}
}
public class HybridSuperDemo {
	public static void main(String[] args) {
		library2 o1=new library2("santosh",21,"core java","abc");
		System.out.println("------------------------------------");
		dept2 o2=new dept2("richard",32,"python","xyz","cs",101);
		System.out.println("------------------------------------");
		sports2 o3=new sports2("priya",22,1001,"badminton");
	}

}
