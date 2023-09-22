package com.gentech.parameterizedconstructor;
class Fruits
{
	String name;
	String color;
	String shape;
	int cost;
	Fruits(String fname,String col,String s,int costs){
		name=fname;
		color=col;
		shape=s;
		cost=costs;
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
	Flowers(String fname,String col,int costs,String quants){
		name=fname;
		color=col;
		cost=costs;
		quantity=quants;
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
	Vegetables(String vname,String col,String t,String s){
		name=vname;
		color=col;
		taste=t;
		size=s;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
		System.out.println("size: "+size);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Fruits app = new Fruits("Apple", "red", "round",55);

		Flowers rose = new Flowers("rose", "pink", 75, "10grams");

		Vegetables bitter = new Vegetables("Bittergourd", "Green", "Bitter", "Medium");

	}

}
