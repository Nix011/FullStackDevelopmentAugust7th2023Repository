package com.gentech.inheritancedemo;
class superclass
{
	int x;
	String y;
	superclass(int x, String y)
	{
		this.x=x;
		this.y=y;
		System.out.println("constructor1 of superclass: x="+x+" y="+y);
	}
	superclass(int x)
	{
		this.x=x;
		System.out.println("constructor2 of superclass: x="+x);
	}
	superclass(String y)
	{
		this.y=y;
		System.out.println("constructor3 of superclass: y="+y);
	}
}
class subclass extends superclass
{
	subclass(int x)
	{
		super(x);
		System.out.println("subclass constructor1: x="+x);
	}
	subclass(int x, String y)
	{
		super(x,y);
		System.out.println("subclass constructor2: x="+x+" y="+y);
	}
}
public class MultilevelConstructorOverloadingDemo {
	public static void main(String[] args) {
		subclass o1=new subclass(10);
		System.out.println("---------------------------");
		subclass o2=new subclass(20,"santosh");
	}

}
