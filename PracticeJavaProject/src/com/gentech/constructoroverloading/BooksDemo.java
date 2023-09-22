package com.gentech.constructoroverloading;
class Book
{
	Book(String bookname,String authorname,String Publisher)
	{
		System.out.println("Book Name: "+bookname);
		System.out.println("Author Name: "+authorname);
		System.out.println("Publisher Name: "+Publisher);

	}
	Book(int bookid)
	{
		System.out.println("Book ID: "+bookid);
	}
}

public class BooksDemo {
	public static void main(String[] args) {
		Book obj1= new Book("Robotic Process Automation","Richard","Swapna book Publishers");
		Book obj2=new Book(25690);


	}

}
