package com.gentech.staticdemo;
class Demo10
{
	void primenum(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("the num is prime number");
		}
		else {
			
			System.out.println("the num is not prime number");
		}
	}
	boolean primenum1(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
			return true;
		else 
			return false;
	}
}
public class PrimeNosVoidMethod {

	public static void main(String[] args) {
		Demo10 obj=new Demo10();
		//Display number between 100 to 50
		System.out.println("Display number between 100 to 50: ");
		for(int i=100;i>=50;i--)
		{
			if(obj.primenum1(i)==true)
			{
				System.out.println(i);
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Display number between 1 to 50
		System.out.println("Display number between 1 to 50: ");
		for(int i=1;i<=50;i++)
		{
			if(obj.primenum1(i)==true)
			{
				System.out.println(i);
			}
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//Display Sum of prime number between 100 to 200
		System.out.println("Display Sum of prime number between 100 to 200: ");
		int sum=0;
		for(int i=100;i<=200;i++) 
		{
			if(obj.primenum1(i)==true)
			{
				sum=sum+1;
			}
		}
		System.out.println(sum);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//Display count of prime number between 150 to 300
		System.out.println("Display count of prime number between 150 to 300: ");
		int count=0;
		for(int i=150;i<=300;i++)
		{
			if(obj.primenum1(i)==true)
			{
				count=count+1;
			}
		}
		System.out.println(count);

	}

}
