package com.gentech.noargsdemo;
class student {
	int rollno;
	String name;
	int marks;
	String fathername;
	student(){
		rollno=11;
		name="Mayank";
		marks=529;
		fathername="varma";
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
	library(){
		bookname="Java";
		noofbooksavailable=6;
		author="Riched";
		subject="Computer science";
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
	sports(){
		sportstype="Basket ball";
		noofplayers=20;
		itemname="ball";
		noofitems=5;
		System.out.println("Sports name:"+sportstype);
		System.out.println("No of players: "+noofplayers);
		System.out.println("Item nam:"+itemname);
		System.out.println("No of items available:"+noofitems);
	}

}

public class Demo4 {

	public static void main(String[] args) {
		student stu = new student();

		library lib = new library();

		sports sp=new sports();



	}

}

