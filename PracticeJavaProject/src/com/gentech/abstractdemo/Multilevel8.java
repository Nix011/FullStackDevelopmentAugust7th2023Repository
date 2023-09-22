package com.gentech.abstractdemo;
abstract class student1
{
	String fname;
	int age;
	student1(String fname,int age)
	{
		this.fname=fname;
		this.age=age;
		System.out.println("superclass constructor1: name="+fname+" age="+age);
	}
	student1(int age)
	{
		this.age=age;
		System.out.println("superclass constructor2: age="+age);
	}
	student1(String fname)
	{
		this.fname=fname;
		System.out.println("superclass constructor3: name="+fname);
	}
}
abstract class college11 extends student1
{
	college11(String name,int age)
	{
		super(name,age);
		System.out.println("subclass1 constructor1: name="+name+" age="+age);
	}
	college11(int age)
	{
		super(age);
		System.out.println("subclass1 constructor2: age="+age);
	}
	college11(String name)
	{
		super(name);
		System.out.println("subclass1 constructor3: name="+name);
	}
}
class canteen11 extends college11
{
	canteen11(String name,int age)
	{
		super(name,age);
		System.out.println("subclass2 constructor1: name="+name+" age="+age);
	}
	canteen11(int age)
	{
		super(age);
		System.out.println("subclass2 constructor2: age="+age);
	}
	canteen11(String name)
	{
		super(name);
		System.out.println("subclass2 constructor3: name="+name);
	}
}
public class Multilevel8 {
	public static void main(String[] args) {
		canteen11 c1=new canteen11("santosh",21);
		System.out.println("-------------------------------------------------");
		canteen11 c2=new canteen11("richard");
		System.out.println("-------------------------------------------------");
		canteen11 c3=new canteen11(32);
	}

}
