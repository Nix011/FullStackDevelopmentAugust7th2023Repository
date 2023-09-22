package com.gentech.inheritancedemo;
class simple1
{
	void add(int x,int y)
	{
		System.out.println("Addition result:"+(x+y));
	}
}
class simple2 extends simple1
{
	void sub(int x,int y)
	{
		System.out.println("subtraction result:"+(x-y));
	}
}
public class SimpleInheritanceDemo {
	public static void main(String[] args) {
		simple2 s1=new simple2();
		s1.add(10, 50);
		s1.sub(100, 80);

	}

}
