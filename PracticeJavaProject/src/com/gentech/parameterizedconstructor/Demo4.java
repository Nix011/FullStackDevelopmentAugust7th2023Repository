package com.gentech.parameterizedconstructor;
class student {
	int rollno;
	String name;
	int marks;
	String fathername;
	student(int rno,String sname,int mark,String fname){
		rollno=rno;
		name=sname;
		marks=mark;
		fathername=fname;
		System.out.println("rollno:"+rollno);
		System.out.println("name: "+name);
		System.out.println("marks:"+marks);
		System.out.println("Father name:"+fathername);
		System.out.println("-----------------------------------------------------------------");
	}

}
class library {
	String bookname;
	int noofbooksavailable;
	String author;
	String subject;
	library(String bname,int avail,String authors,String sub){
		bookname=bname;
		noofbooksavailable=avail;
		author=authors;
		subject=sub;
		System.out.println("Book name:"+bookname);
		System.out.println("No Of book available:"+noofbooksavailable);
		System.out.println("Author name:"+author);
		System.out.println("subjectname:"+subject);
		System.out.println("-----------------------------------------------------------------");
	}
}
class sports {
	String sportstype;
	int noofplayers;
	String itemname;
	int noofitems;
	sports(String st,int players,String itname,int items){
		sportstype=st;
		noofplayers=players;
		itemname=itname;
		noofitems=items;
		System.out.println("Sports name:"+sportstype);
		System.out.println("No of players: "+noofplayers);
		System.out.println("Item nam:"+itemname);
		System.out.println("No of items available:"+noofitems);
	}

}

public class Demo4 {

	public static void main(String[] args) {
		student stu = new student(11, "Mayank", 529, "varma");

		library lib = new library("Java", 6, "Riched", "computer science");

		sports sp=new sports("Basket ball",20,"ball", 5);



	}

}
