package com.gentech.abstractdemo;
abstract class hybridsuperclass
{
	abstract void show2();
}
abstract class subclass1 extends hybridsuperclass
{
	abstract void show22();
}
class subclass2 extends subclass1
{
	void show2()
	{
		System.out.println("superclass code inherited in subclass2");
	}
	void show22()
	{
		System.out.println("subclass2 code");
	}
}
class subclass3 extends hybridsuperclass
{
	void show2()
	{
		System.out.println("superclass code inherited in subclass 3");
	}
}
public class Hybrid6 {
	public static void main(String[] args) {
		subclass3 o1=new subclass3();
		o1.show2();
		System.out.println("----------------------------------");
		subclass2 o2=new subclass2();
		o2.show2();
		o2.show22();
	}

}
