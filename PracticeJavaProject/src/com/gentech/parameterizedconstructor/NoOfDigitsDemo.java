package com.gentech.parameterizedconstructor;
class digits{
	digits(int n)
	{
		if((n<10)&&(n>=1))
		{
			System.out.println(n+" single digit");
		}
		else if((n<100)&&(n>=10))
		{
			System.out.println(n+" two digit");
		}
		else if((n<1000)&&(n>=100))
		{
			System.out.println(n+" three digit");
		}
		else if((n<10000)&&(n>=1000))
		{
			System.out.println(n+" four digit");
		}
		else if((n<100000)&&(n>=10000))
		{
			System.out.println(n+" five digit");
		}
		else
		{
			System.out.println(n+" more than 5 digits");
		}
	}
}
public class NoOfDigitsDemo {

	public static void main(String[] args) {
		digits d1=new digits(100);
		digits d2=new digits(10000000);
		digits d3=new digits(1);
		digits d4=new digits(1000);
	}

}
