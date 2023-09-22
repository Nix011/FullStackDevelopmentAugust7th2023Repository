package com.gentech.classDemo2;
class Country
{
	String name;
	String nationallanguage;
	int noofstates;
	String capital;
}
class State
{
	String name;
	String Language;
	int noofdist;
	String capital;
}
class District
{
	String name;
	int nooftaluks;
	String famousplace;
	int pincode;
}
public class Demo5 {

	public static void main(String[] args) {
		Country Ind = new Country();
		Ind.name="India";
		Ind.nationallanguage="Hindi";
		Ind.noofstates=29;
		Ind.capital="Delhi";
		System.out.println("name: "+Ind.name);
		System.out.println("nationallanguage: " +Ind.nationallanguage);
		System.out.println("noofstates: "+Ind.noofstates);
		System.out.println("capital: "+Ind.capital);
		System.out.println("+++++++++++++++++++++++++");
		State Kar = new State();
		Kar.name="Karnataka";
		Kar.Language="Kannada";
		Kar.noofdist=30;
		Kar.capital="Bangalore";
		System.out.println("name: "+Kar.name);
		System.out.println("language: " +Kar.Language);
		System.out.println("noofdist: "+Kar.noofdist);
		System.out.println("capital: "+Kar.capital);
		System.out.println("+++++++++++++++++++++++++");
		District Chick = new District();
		Chick.name="Chickballapura";
		Chick.nooftaluks=6;
		Chick.famousplace="Nandihills";
		Chick.pincode=562105;
		System.out.println("name: "+Chick.name);
		System.out.println("nooftaluks: " +Chick.nooftaluks);
		System.out.println("famousplace: "+Chick.famousplace);
		System.out.println("pincode: "+Chick.pincode);
		System.out.println("+++++++++++++++++++++++++");
	}

}
