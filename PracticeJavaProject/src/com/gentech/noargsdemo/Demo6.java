package com.gentech.noargsdemo;
class Fruits
{
	String name;
	String color;
	String shape;
	int cost;
	Fruits(){
		name="Apple";
		color="Red";
		shape="Round";
		cost=55;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("shape: "+shape);
		System.out.println("cost: "+cost);
		System.out.println("+++++++++++++++++++++++++++++");

	}
}
class Flowers
{
	String name;
	String color;
	int cost;
	String quantity;
	Flowers(){
		name="Rose";
		color="Pink";
		cost=75;
		quantity="10grams";
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("cost: "+cost);
		System.out.println("quantity: "+quantity);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Vegetables
{
	String name;
	String color;
	String taste;
	String size;
	Vegetables(){
		name="Bitter Gourd";
		color="Green";
		taste="Bitter";
		size="Medium";
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
		System.out.println("size: "+size);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Fruits app = new Fruits();

		Flowers rose = new Flowers();

		Vegetables bitter = new Vegetables();

	}

}
