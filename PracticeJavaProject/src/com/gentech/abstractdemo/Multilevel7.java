package com.gentech.abstractdemo;
abstract class continent
{
	String continentname;
	int conid;
	continent(String continentname,int conid)
	{
		System.out.println("superclass name: "+continentname);
		System.out.println("superclass id: "+conid);
	}
}
abstract class country extends continent
{
	country(String name,int id)
	{
		super(name,id);
		System.out.println("1st subclass name: "+name);
		System.out.println("1st subclass id: "+id);
	}
}
class state extends country
{
	state(String name,int id)
	{
		super(name,id);
		System.out.println("2nd subclass name: "+name);
		System.out.println("2nd subclass id: "+id);
	}
}
public class Multilevel7 {
	public static void main(String[] args) {
		state s1=new state("asia",10);
	}

}
