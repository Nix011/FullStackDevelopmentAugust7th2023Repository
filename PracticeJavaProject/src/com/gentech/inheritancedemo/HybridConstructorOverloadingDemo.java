package com.gentech.inheritancedemo;
class superclass1
{
	int x;
	String y;
	superclass1(int x)
	{
		this.x=x;
		System.out.println("superclass constructor1: x="+x);
	}
	superclass1(int x,String y)
	{
		this.x=x;
		this.y=y;
		System.out.println("superclass constructor2: x="+x+" y="+y);
	}
	superclass1(String y)
	{
		this.y=y;
		System.out.println("superclass constructor3: y="+y);
	}
}
class subclass1 extends superclass1
{
	subclass1(int x,String y)
	{
		super(x,y);
		System.out.println("subclass1 constructor: x="+x+" y="+y);
	}
	subclass1(int x)
	{
		super(x);
		System.out.println("subclass1 constructor: x="+x);
	}
	subclass1(String y)
	{
		super(y);
		System.out.println("subclass1 constructor: y="+y);
	}
}
class subclass2 extends subclass1
{
	subclass2(int x, String y)
	{
		super(x,y);
		System.out.println("subclass2 constructor: x="+x+" y="+y);
	}
	subclass2(int x)
	{
		super(x);
		System.out.println("subclass2 constructor: x="+x);
	}
	subclass2(String y)
	{
		super(y);
		System.out.println("subclass2 constructor: y="+y);
	}
}
class subclass3 extends superclass1
{
	subclass3(int x)
	{
		super(x);
		this.x=x;
		System.out.println("subclass3 constructor: x="+x);
	}
	subclass3(String y)
	{
		super(y);
		this.y=y;
		System.out.println("subclass3 constructor: y="+y);
	}
	subclass3(int x,String y)
	{
		super(x,y);
		this.x=x;
		this.y=y;
		System.out.println("subclass3 constructor: x="+x+" y="+y);
	}
}
public class HybridConstructorOverloadingDemo {
	public static void main(String[] args) {
		subclass1 o1=new subclass1(10,"santosh");
		System.out.println("-----------------------------");
		subclass2 o2=new subclass2(20);
		System.out.println("-----------------------------");
		subclass3 o3=new subclass3("richard");
		System.out.println("-----------------------------");
		subclass3 o4=new subclass3(30,"priya");
	}

}
