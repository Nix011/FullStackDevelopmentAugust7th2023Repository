package com.gentech.inheritancedemo;
class university
{
	String uname;
	int uid;
	void show()
	{
		System.out.println("superclass: name="+uname);
		System.out.println("superclass: id="+uid);
	}
}
class college extends university
{
	String uname;
	int uid;
	
	college(String name,int id)
	{
		super.uname=name;
		super.uid=id;
	}
	void display1()
	{
		System.out.println("1st subclass: name="+uname);
		System.out.println("1st subclass: id="+uid);
	}
}
class department2 extends college
{
	String uname;
	int uid;
	department2(String name,int id)
	{
		super(name,id);
		super.uname=name;
		super.uid=id;
	}
	void display2()
	{
		System.out.println("2nd subclass: name="+uname);
		System.out.println("2nd subclass: id="+uid);
	}
}
public class SameVariableDemo {
	public static void main(String[] args) {
		department2 d1=new department2("vtu",100);
		d1.show();
		System.out.println("----------------------------");
		d1.display1();
		System.out.println("----------------------------");
		d1.display2();
	}

}
