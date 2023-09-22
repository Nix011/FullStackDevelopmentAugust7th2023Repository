package com.gentech.encapsulationdemo;
class maths1
{
	static maths1 obj=null;
	private maths1()
	{
		//it is a private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication result:"+res);
	}
	public static maths1 getinstance()
	{
		if(obj==null)
		{
			obj=new maths1();
		}
		return obj;
	}
}
public class DebugDemo {
	public static void main(String[] args) {
		maths1 o1=maths1.getinstance();
		o1.addition(10, 20);
		o1.multiplication(5,10);

		maths1 o2=maths1.getinstance();
		o2.addition(30, 20);
		o2.multiplication(20, 25);

		maths1 o3=maths1.getinstance();
		o3.addition(100, 350);
		o3.multiplication(12, 15);

		if(o1==o2 && o2==o3)
		{
			System.out.println("achieved singleton");
		}
		else
		{
			System.out.println("failed singleton");
		}

	}

}
