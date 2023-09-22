package com.gentech.inheritancedemo;
class hybrid1
{
	void college(int clgid,String clgname)
	{
		System.out.println("college details: college id="+clgid+" college name"+clgname);
	}
}
class hybrid2 extends hybrid1
{
	void university(int uni_id,String uni_name)
	{
		System.out.println("university details: Id="+uni_id+" name="+uni_name);
	}
}
class hybrid3 extends hybrid2
{
	void department(int did,String dname)
	{
		System.out.println("department details: Id="+did+" name="+dname);
	}
}
class hybrid4 extends hybrid1
{
	void canteen(int cid,String cname)
	{
		System.out.println("canteen details: Id="+cid+" name="+cname);
	}
}
public class HybridDemo {
	public static void main(String[] args) {
		hybrid2 h1=new hybrid2();
		h1.college(10, "biet");
		h1.university(100, "vtu");
		
		System.out.println("---------------------------------");
		hybrid3 h2=new hybrid3();
		h2.college(200, "gmit");
		h2.university(250, "vtu");
		h2.department(12, "cs");
		
		System.out.println("---------------------------------");
		hybrid4 h3=new hybrid4();
		h3.college(30,"ubdt");
		h3.canteen(49, "indira canteen");
	}

}
