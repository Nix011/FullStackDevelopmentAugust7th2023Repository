package com.gentech.inheritancedemo;
class heirarchy1
{
	void song(int sid,String sname)
	{
		System.out.println("song details: Id="+sid+" name="+sname);
	}
}
class heirarchy2 extends heirarchy1
{
	void writtenby(int wid,String writer)
	{
		System.out.println("written details: Id="+wid+" name="+writer);
	}
}
class heirarchy3 extends heirarchy1
{
	void singer(int sgid,String sgname)
	{
		System.out.println("singer details: Id="+sgid+" name="+sgname);
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		heirarchy2 h1=new heirarchy2();
		h1.writtenby(100,"vaibhav");
		h1.song(15, "kagada doni");

		System.out.println("-------------------------------------");
		heirarchy3 h2=new heirarchy3();
		h2.singer(5, "taylor");
		h2.song(25, "flowers");
	}

}
