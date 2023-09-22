package com.gentech.classDemo2;
class student {
	int rollno;
	String name;
    int marks;
    String fathername;

}
class library {
	String bookname;
    int noofbooksavailable;
    String author;
    String subject;

}
class sports {
	String sportstype;
    int noofplayers;
    String itemname;
    int noofitems;

}

public class Demo4 {

	public static void main(String[] args) {
		student stu = new student();
		stu.rollno=11;
		stu.name="Mayank";
		stu.marks=529;
		stu.fathername="varma";
		System.out.println("rollno:"+stu.rollno);
		System.out.println("name: "+stu.name);
		System.out.println("marks:"+stu.marks);
		System.out.println("Father name:"+stu.fathername);
		System.out.println("-----------------------------------------------------------------");
		library lib = new library();
		lib.bookname="Java";
		lib.noofbooksavailable=6;
		lib.author="Riched";
		lib.subject="Computer science";
		System.out.println("Book name:"+lib.bookname);
		System.out.println("No Of book available:"+lib.noofbooksavailable);
		System.out.println("Author name:"+lib.author);
		System.out.println("subjectname:"+lib.subject);
		System.out.println("-----------------------------------------------------------------");
		sports sp=new sports();
		sp.sportstype="Basket ball";
		sp.noofplayers=20;
		sp.itemname="ball";
		sp.noofitems=5;
		System.out.println("Sports name:"+sp.sportstype);
		System.out.println("No of players: "+sp.noofplayers);
		System.out.println("Item nam:"+sp.itemname);
		System.out.println("No of items available:"+sp.noofitems);
		

	}

}
