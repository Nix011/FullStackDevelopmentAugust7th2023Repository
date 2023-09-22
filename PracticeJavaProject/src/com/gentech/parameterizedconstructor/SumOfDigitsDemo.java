package com.gentech.parameterizedconstructor;
class sum
{
	sum(int n)
	{
		int s=0;
		System.out.println("the no. to be added:"+n);
		while(n>0)
		{
			int a=n%10;
			s=s+a;
			n=n/10;
		}
		System.out.println("sum of digits is: "+s);
	}
}
public class SumOfDigitsDemo {

	public static void main(String[] args) {
		sum o1=new sum(12996);

	}

}
