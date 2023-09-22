package com.gentech.abstractdemo;
abstract class bank
{
	static{
		System.out.println("static block code");
	}
}
class location extends bank
{
	
}
public class StaticBlockDemo {
	public static void main(String[] args) {
		location o=new location();
		
	}

}
