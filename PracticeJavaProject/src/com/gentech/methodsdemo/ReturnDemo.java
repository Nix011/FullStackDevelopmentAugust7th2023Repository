package com.gentech.methodsdemo;
class Demo5
{
	boolean AndOp(boolean x,boolean y)//returns the result of logical operator AND
	{
		return x&&y;
	}
	int elements(int x[])//returns no. of elements in a given 1D array
	{
		return x.length;
	}
	int avg(int x,int y)//returns average of 2 no.s
	{
		return (x+y)/2;
	}
	int sum()//returns sum of 1st 10 no.s
	{
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
		}
		return s;
	}
	int fact(int z)//returns factorial of given no.
	{
		int f=1;
		for(int i=1;i<=z;i++)
		{
			f=f*i;
		}
		return f;
	}
	int divby10(int start,int end)//returns count of no.s in between 100 to 1 divisible by 10
	{
		int count = 0;
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		for (int i = start; i <= end; i++) {
			if (i % 10 == 0) {
				count++;
			}
		}

		return count;
	}
	byte[] firsthalf(byte x[])//returns first half of element from 1D byte array
	{
		byte z[]= new byte[x.length/2];
		for(int i=0;i<x.length/2;i++)
		{
			z[i]=x[i];
		}
		return z;
	}
	short sum1(short x[])//returns sum of all elements from 1D short array
	{
		short sum = 0;
		for (short ele:x) {
			sum += ele;
		}
		return sum;
	}
	int largest(int x, int y)//returns largest no. from given 2 no.s
	{
		if(x>y)
			return x;
		else
			return y;
	}
	int smallest(int x,int y, int z)//returns smallest no. from given 3 no.s
	{
		if((x>y)&&(x>z))
		{
			return x;
		}
		else if((y>x)&&(y>z))
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	boolean isAlphabet(char c)//returns the given input is alphabet or not
	{
		return (c>='a' && c<='z') || (c>='A' && c<='Z');
	}
	String[][] transpose(String x[][])//returns transpose of a given 2D 3x3 string array
	{
		String y[][]=new String[x.length][x[0].length];
		for (int i = 0; i <x.length; i++) 
		{
			for (int j = 0; j <x[i].length; j++)
			{
				y[i][j]=x[j][i];
				//System.out.print(x[j][i]+" ");
			}
			//System.out.println();
		}
		return y;
	}
	int[] square(int x[])//returns square of each elements from 1D integer array
	{
		int result[]=new int[x.length];
		for (int i = 0; i <x.length; i++) {
			result[i] = x[i]*x[i];
			//System.out.print(result+" ");
		}
		//System.out.println();
		return result;
	}
	int Div6()//returns no. between 1 to 100 divisible by 6
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				//return i;
				//System.out.print(i+" ");
			}
		}
		return i;
	}
}
public class ReturnDemo {

	public static void main(String[] args) {
		Demo5 d=new Demo5();
		System.out.println("Logical AND operator result: ");
		System.out.println(d.AndOp(false, true));
		System.out.println("----------------------------------------------------");
		int a[]= {1,2,3,4,5,6};
		System.out.println("No. of elements in given array: ");
		System.out.println(d.elements(a));
		System.out.println("----------------------------------------------------");
		System.out.println("Average of 2 no.s: ");
		System.out.println(d.avg(10, 15));
		System.out.println("----------------------------------------------------");
		System.out.println("sum of first 10 no.s: ");
		System.out.println(d.sum());
		System.out.println("----------------------------------------------------");
		System.out.println("factorial of a given no. :");
		System.out.println(d.fact(5));
		System.out.println("----------------------------------------------------");
		System.out.println("count: ");
		System.out.println(d.divby10(1, 100));
		System.out.println("----------------------------------------------------");
		System.out.println("first half of the elements are: ");
		byte b[]= {1,2,3,4};
		byte k[]=d.firsthalf(b);
		for(byte e:k) {
		System.out.println(e+" ");
		}
		System.out.println("----------------------------------------------------");
		short c[]= {10,20,30,40};
		System.out.println("sum of all elements: ");
		System.out.println(d.sum1(c));
		System.out.println("----------------------------------------------------");
		System.out.println("largest no. is: ");
		System.out.println(d.largest(100, 144));
		System.out.println("----------------------------------------------------");
		System.out.println("smallest no. is: ");
		System.out.println(d.smallest(10, 5, 25));
		System.out.println("----------------------------------------------------");
		System.out.println("given inputs are aplhabets are not: ");
		System.out.println(d.isAlphabet('d'));
		System.out.println(d.isAlphabet('1'));
		System.out.println("----------------------------------------------------");
		String e[][]= {{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}};
		System.out.println("transpose: ");
		String dd[][]=d.transpose(e);
		for(int i=0;i<dd.length;i++)
		{
			for(int j=0;j<dd[i].length;j++)
			{
				System.out.print(dd[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		int f[]= {1,2,3,4,5,6};
		int g[]=d.square(f);
		for(int kk:g)
		System.out.println("square of all values: "+kk);
		//d.square(f);
		System.out.println("----------------------------------------------------");
		System.out.println("numbers divisible by 6 are: ");
		d.Div6();

	}

}
