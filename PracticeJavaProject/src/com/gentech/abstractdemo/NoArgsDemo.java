package com.gentech.abstractdemo;
abstract class university
{
	university()
	{
		System.out.println("block of code from no-args constructor");
	}
}
class college1 extends university
{
}
public class NoArgsDemo {
	public static void main(String[] args) {
		college1 c=new college1();
	}

}
