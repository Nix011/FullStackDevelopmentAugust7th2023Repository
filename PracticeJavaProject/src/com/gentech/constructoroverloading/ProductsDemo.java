package com.gentech.constructoroverloading;
class Product
{
	Product(String productname,String companyname,String address)
	{
		System.out.println("Product Name: "+productname);
		System.out.println("Company Name: "+companyname);
		System.out.println("College University: "+address);
    }
	Product(int productid,int price)
	{
		System.out.println("Product ID: "+productid);
		System.out.println("Price: "+price);
    }
	Product(double rating)
	{
	    System.out.println("Rating: "+rating);
	
	}
}

public class ProductsDemo {

	public static void main(String[] args) {
		Product obj1=new Product(1001,65000);
		Product obj2=new Product("Laptop","Sony","Bangalore");
		Product obj3=new Product(4.7);

	}

}
