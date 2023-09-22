package com.gentech.noargsdemo;
class employee
{
	String name;
	int age;
	String email;
	long phoneno;
	employee()
	{
		name="Ravi";
		age=29;
		email="ravi@gmail.com";
		phoneno=698541230;
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
	department(){
		name="Karnataka";
		location="banglore";
		noofmembers=30;
		depthead="sanya";
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
	insurance(){
		insurancename="LIC insurance";
		typeofinsuranve="health insurance";
		insuranceamount=100000;
		System.out.println("insurancename: "+insurancename);
		System.out.println("insurancetype: " +typeofinsuranve);
		System.out.println("insuranceamount: "+insuranceamount);
		System.out.println("+++++++++++++++++++++++++");

	}

}
public class Demo3 {

	public static void main(String[] args) {
		employee emp = new employee();

		department dep = new department();

		insurance ins = new insurance();
	}

}
