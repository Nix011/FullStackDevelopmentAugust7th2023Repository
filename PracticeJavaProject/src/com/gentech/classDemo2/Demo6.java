package com.gentech.classDemo2;
class Fruits
{
	String name;
	String color;
	String shape;
	int cost;
}
class Flowers
{
	String name;
	String color;
	int cost;
	String quantity;
}
class Vegetables
{
	String name;
	String color;
	String taste;
	String size;
}
public class Demo6 {

	public static void main(String[] args) {
		Fruits app = new Fruits();
		app.name="Apple";
		app.color="Red";
		app.shape="Round";
		app.cost=55;
		System.out.println("name: "+app.name);
		System.out.println("color: "+app.color);
		System.out.println("shape: "+app.shape);
		System.out.println("cost: "+app.cost);
		System.out.println("+++++++++++++++++++++++++++++");
		Flowers rose = new Flowers();
		rose.name="Rose";
		rose.color="Pink";
		rose.cost=75;
		rose.quantity="10grams";
		System.out.println("name: "+rose.name);
		System.out.println("color: "+rose.color);
		System.out.println("cost: "+rose.cost);
		System.out.println("quantity: "+rose.quantity);
		System.out.println("+++++++++++++++++++++++++++++");
		Vegetables bitter = new Vegetables();
		bitter.name="Bitter Gourd";
		bitter.color="Green";
		bitter.taste="Bitter";
		bitter.size="Medium";
		System.out.println("name: "+bitter.name);
		System.out.println("color: "+bitter.color);
		System.out.println("taste: "+bitter.taste);
		System.out.println("size: "+bitter.size);
		System.out.println("+++++++++++++++++++++++++++++");
	}

}
