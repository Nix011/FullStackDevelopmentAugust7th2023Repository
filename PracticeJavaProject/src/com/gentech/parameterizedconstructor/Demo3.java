package com.gentech.parameterizedconstructor;
class employee
{
	String name;
	int age;
	String email;
	long phoneno;
	employee(String ename,int ages,String mail,long phno)
	{
		name=ename;
		age=ages;
		email=mail;
		phoneno=phno;
		System.out.println("name: "+name);
		System.out.println("age: " +age);
		System.out.println("email: "+email);
		System.out.println("phoneno: "+phoneno);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class department
{
	String name;
	String location;
	int noofmembers;
	String depthead;
	department(String dname,String loc,int members,String dhead){
		name=dname;
		location=loc;
		noofmembers=members;
		depthead=dhead;
		System.out.println("name: "+name);
		System.out.println("location: " +location);
		System.out.println("noofmembers: "+noofmembers);
		System.out.println("depthead: "+depthead);
		System.out.println("+++++++++++++++++++++++++");

	}
}
class insurance
{
	String insurancename;
	String typeofinsuranve;
	int insuranceamount;
	insurance(String iname,String type,int amount){
		insurancename=iname;
		typeofinsuranve=type;
		insuranceamount=amount;
		System.out.println("insurancename: "+insurancename);
		System.out.println("insurancetype: " +typeofinsuranve);
		System.out.println("insuranceamount: "+insuranceamount);
		System.out.println("+++++++++++++++++++++++++");

	}

}
public class Demo3 {

	public static void main(String[] args) {
		employee emp = new employee("ravi", 29, "ravu@gmail.com", 698541230);

		department dep = new department("karnataka", "bangalore", 30, "sanya");

		insurance ins = new insurance("LIC insurance", "health insurance", 100000);
	}

}
