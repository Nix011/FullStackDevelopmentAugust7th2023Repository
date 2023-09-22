package com.gentech.constructoroverloading;
class college
{
	college(String name)
	{
		System.out.println("college name:"+name);
	}
	college(int cId)
	{
		System.out.println("college ID:"+cId);
	}
	
}
public class collegeDemo {

	public static void main(String[] args) {
		college o1=new college("ATME College");
		college o2=new college(11);

	}

}
