package com.gentech.inheritancedemo;
class continent
{
	void showstatename(String statename,int sid)
	{
		System.out.println("the state name in parent class: "+statename);
		System.out.println("the state id in parent class: "+sid);
	}
}
class country extends continent
{
	String statelang;
	country(String name,int id,String statelang)
	{
		super.showstatename(name, id);
		this.statelang=statelang;

	}
	void showstatename(String statename,int sid, String statelang)
	{
		System.out.println("the state name in 1st child class: "+statename);
		System.out.println("the state id in 1st child class: "+sid);
		System.out.println("the state language in 1st child class: "+statelang);
	}
}
class state extends country
{
	state(String name,int id,String statelang)
	{
		super(name,id,statelang);
		super.showstatename(name,id,statelang);
	}
	void showstatename(String statename,int sid,String statelang)
	{
		System.out.println("the state name in 2nd child class: "+statename);
		System.out.println("the state id in 2nd child class: "+sid);
		System.out.println("the state language in 2nd child class: "+statelang);
	}
}
public class SameMethodDemo {
	public static void main(String[] args) {
		state s1=new state("america",50,"english");
		System.out.println("------------------------");
		s1.showstatename("karnataka", 21);
		System.out.println("------------------------");
		s1.showstatename("kerala",45);
	}

}
