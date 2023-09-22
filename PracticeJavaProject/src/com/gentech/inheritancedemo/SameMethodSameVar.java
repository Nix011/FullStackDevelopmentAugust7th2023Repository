package com.gentech.inheritancedemo;
class bank2
{
	int bid;
	String bankname;
	void show(String name, int id)
	{
		this.bankname=name;
		this.bid=id;
		System.out.println("superclass: name="+bankname);
		System.out.println("superclass: id="+bid);
	}
}
class branch3 extends bank2
{
	int bid;
	String bankname;
	branch3(String name,int id)
	{
		super.show(name,id);
	}
	void show(String name, int id)
	{
		System.out.println("1st subclass: name="+name);
		System.out.println("1st subclass: id="+id);
	}
}
class accounts3 extends branch3
{
	int bid;
	String bankname;
	accounts3(String name, int id) 
	{
		super(name,id);
		super.show(name,id);
	}
	String name;

	void show(String name, int id)
	{
		System.out.println("2nd subclass: name="+name);
		System.out.println("2nd subclass: id="+id);
	}
}

public class SameMethodSameVar {

	public static void main(String[] args) {
		accounts3 o1=new accounts3("sbi",91);
		System.out.println("-------------------------");
		o1.show("icici",45);
		//System.out.println("--------------------------");
		//o1.show("karnataka",22);

	}

}
