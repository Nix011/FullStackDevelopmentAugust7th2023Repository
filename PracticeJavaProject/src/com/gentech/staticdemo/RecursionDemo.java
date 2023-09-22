package com.gentech.staticdemo;
class maths10
{
	//Display odd numbers between 20 to 40
	static int x=20;
	static void shownumbers()
	{
		if(x<=40)
		{
			if(x%2==1)
			{
				System.out.println(x);
			}
			x++;
			shownumbers();
		}
	}

	//Display Even number between 20 to 1

	static int a=20;
	static void shownumber()
	{
		if(a>=1)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a--;
			shownumber();
		}
	}

	//Display number divisible by 8
	static int z=1;
	static void shownumberdivisibleby8()
	{
		if(z<=100)
		{
			if(z%8==0)
			{
				System.out.println(z);
			}
			z++;
			shownumberdivisibleby8();
		}
	}

	//Display count of numbers divisible by 10
	static int count=1;
	static int sum1=0;
	static void showcountdivisibleby10()
	{
		if(count<=10)
		{
			sum1=sum1+i;
			count+=1;
			showcountdivisibleby10();
			}
	}
	static void showcount()
	{
		System.out.println(sum);
	}


	//sum of first 20numbers
	static int y=1, sum=0;
	static void showsumoffirst20numbers()
	{
		if(y<=20) 
		{
			sum=sum+y;

			y++;
		}
			System.out.println(sum);
		showsumoffirst20numbers();
	}



	// Display Tenth Table
	static int i=1;
	static void showtentable()
	{
		if(i<=10)
		{
			System.out.println("10*"+i+"="+i*10);

			i++;
			showtentable();
		}
	}
	//Display fiveTable in reverse
	static int p=10;
	static void showfivetable()
	{
		if(p>=1)
		{
			System.out.println("5*"+p+"="+p*5);
			p--;
			showfivetable();

		}
	}
}
public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println("Odd no.s from 20 to 40: ");
		maths10.shownumbers();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.shownumber();
		System.out.println("Even no.s from 20 to 1: ");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Divisible by 8: ");
		maths10.shownumberdivisibleby8();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.showcount();
		System.out.println("++++++++++++++++++++++++++++++++++");
		//maths10.showsumoffirst20numbers();
		//System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("10th table: ");
		maths10.showtentable();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("5th table in reverse order: ");
		maths10.showfivetable();	
	}
}
