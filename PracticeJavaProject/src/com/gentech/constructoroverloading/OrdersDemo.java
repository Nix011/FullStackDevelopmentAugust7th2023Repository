package com.gentech.constructoroverloading;
class Orders
{
	Orders(String address)
	{
		System.out.println("Order Address: "+address);
	}
	Orders(int orderid,int price)
	{
		System.out.println("Order ID: "+orderid);
		System.out.println("OrderPrice: "+price);
	}
	Orders(double rating)
	{
		System.out.println("Rating: "+rating);

	}
}

public class OrdersDemo {

	public static void main(String[] args) {
		Orders obj1=new Orders(2001,5500);
		Orders obj2=new Orders("6th block,R R Nagar,Bangalore");
		Orders obj3=new Orders(3.5);

	}

}
