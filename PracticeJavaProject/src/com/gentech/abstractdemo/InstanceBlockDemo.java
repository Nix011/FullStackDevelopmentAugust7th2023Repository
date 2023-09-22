package com.gentech.abstractdemo;
abstract class Student
{
	{
		System.out.println("instance block code");
	}
}
class College extends Student
{
}

public class InstanceBlockDemo {

	public static void main(String[] args) {
		College obj=new College();
	}

}
