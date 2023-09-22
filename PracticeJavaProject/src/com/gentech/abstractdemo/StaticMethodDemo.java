package com.gentech.abstractdemo;
abstract class canteen
{
	static void show()
	{
		System.out.println("static method1");
	}
	static void display11()
	{
		System.out.println("static method2");
	}
	static void display12()
	{
		System.out.println("static method3");
	}
}
public class StaticMethodDemo {
	public static void main(String[] args) {
		canteen.show();
		canteen.display11();
		canteen.display12();
	}

}
