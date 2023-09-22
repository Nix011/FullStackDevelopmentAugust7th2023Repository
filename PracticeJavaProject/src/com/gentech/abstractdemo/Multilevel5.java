package com.gentech.abstractdemo;
abstract class superclass
{
	abstract void show1();
}
abstract class subclass extends superclass
{
	abstract void display();
}
class subclass11 extends subclass
{
	void show1()
	{
		System.out.println("code from superclass");
	}
	void display()
	{
		System.out.println("code from 1st subclass");
	}
}
public class Multilevel5 {
	public static void main(String[] args) {
		subclass11 s1=new subclass11();
		s1.show1();
		s1.display();
	}

}
