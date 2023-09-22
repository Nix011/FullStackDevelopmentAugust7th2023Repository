package com.gentech.parameterizedconstructor;
class Country
{
	String name;
	String nationallanguage;
	int noofstates;
	String capital;
	Country(String cname,String nl,int ns,String c){
		name=cname;
		nationallanguage=nl;
		noofstates=ns;
		capital=c;
		System.out.println("name: "+name);
		System.out.println("nationallanguage: " +nationallanguage);
		System.out.println("noofstates: "+noofstates);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class State
{
	String name;
	String Language;
	int noofdist;
	String capital;
	State(String sname,String lang,int nd,String c){
		name=sname;
		Language=lang;
		noofdist=nd;
		capital=c;
		System.out.println("name: "+name);
		System.out.println("language: " +Language);
		System.out.println("noofdist: "+noofdist);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class District
{
	String name;
	int nooftaluks;
	String famousplace;
	int pincode;
	District(String dname,int t,String favplace,int pin){
		name=dname;
		nooftaluks=t;
		famousplace=favplace;
		pincode=pin;
		System.out.println("name: "+name);
		System.out.println("nooftaluks: " +nooftaluks);
		System.out.println("famousplace: "+famousplace);
		System.out.println("pincode: "+pincode);
		System.out.println("+++++++++++++++++++++++++");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Country C = new Country("India", "Hindi", 29, "Delhi");

		State St = new State("karnataka", "kannada", 30, "bangalore");

		District Ds = new District("chickballapura", 6, "Nandihills", 562105);

	}

}
