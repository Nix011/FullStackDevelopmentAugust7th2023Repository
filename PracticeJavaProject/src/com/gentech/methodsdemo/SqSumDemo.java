package com.gentech.methodsdemo;
class Demo4
{
	void square(int x[])//Square each element in 1D array and find its sum
	{
		int z=0;
		for(int i=0;i<=(x.length-1);i++)
		{
			z=z+(x[i]*x[i]);
		}
		System.out.println(z);
	}
	void subtractionarray(int x[][],int y[][])//Subtraction of two 2D matrices in reverse order
	{
		if((x.length==y.length) &&(x[0].length==y[0].length))
		{
			int z[][]=new int [x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for( int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]-y[i][j];
				}
			}
			for(int m=x.length-1;m>=0;m--)
			{
				for( int n=x[m].length-1;n>=0;n--)
				{
					System.out.print(z[m][n]+" ");
				}
				System.out.println();
			}
		}
	}
	void concat1(char ch[])//1D char concatenate
	{
		String c=" ";
		for(int i=0;i<ch.length;i++)
		{
			c=c+ch[i];
		}
		System.out.println(c);
	}
	void concat(String str[][])//2D String concatenate
	{
		String s=" ";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++ )
			{
				s=s+str[i][j];
			}
			System.out.println(s);
		}
	}
	void ReadArray(Byte ch[])//byte array read 2nd half of the elements
	{
		for(int i=ch.length/2;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
	void reading(short x[])//1D short array read 1st half of the elements
	{
		for(int i=0;i<x.length/2;i++) {

			System.out.println(x[i]);			
		}
	}
	void reverse(int x[])//1D int array read 1st half of the elements in reverse order
	{
		for(int i=(x.length-1)/2;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}
	void reverse1(String x[]) //1D String array read in reverse order
	{
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}
	void sum(int x[])//1d int array find the sum of all the elements
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(" sum is: "+sum);
	}
	void checkvowels(char x[])//1d char array display the vowels separately
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u')
			{
				System.out.println(x[i]+" is a vowel");
			}
		}
	}
	void read(int x[][])//2d 3x3 int array read last row elements
	{
		for(int j=0;j<3;j++) 
		{
			System.out.print(x[2][j]+" ");	
		}

	}
	void sum1(int x[][])//2D  3x3 int array find the sum of first row elements
	{
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+x[i][0];
		}
		System.out.println("sum of first row elements is: "+sum);
	}
}

public class SqSumDemo {

	public static void main(String[] args) {
		Demo4 ob=new Demo4();
		System.out.println("BYTE ARRAY");
		Byte x[]= {10,20,30,40,50,60,70,80,90,100};
		ob.ReadArray(x);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SHORT ARRAY");
		short a[]= {10,20,30,40,50,60,70,80,90,100};
		ob.reading(a);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("INT ARRAY");
		int z[]= {10,20,30,40,50,60};
		ob.reverse(z);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("STRING ARRAY");
		String s[][]={{"Apple","mango"},{"Orange","Grapes"}};
		ob.concat(s);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SUM");
		int y[]= {5,10,15};
		ob.sum(y);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("VOWEL");
		char ch[]= {'a','G','I','y','t'};
		ob.checkvowels(ch);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("TWOD ARRAY");
		int q[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ob.read(q);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("TWO D ARRAYS");
		int p[][]= {{10,20,30},{40,50,60},{70,80,90}};
		ob.sum1(p);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SUB");
		int d[][]= {{10,11,12},{13,14,15},{16,17,18}};
		int e[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ob.subtractionarray(d,e);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("CONCAT STRING");
		String o[][]= {{"hi","hello","world"},{"hope","open","hard"},{"joke","hope","kite"}};
		ob.concat(o);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("CONCAT CHAR");
		char l[]= {'c','u','p'};
		ob.concat1(l);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SQUARE");
		int g[]= {1,2,3};
		ob.square(g);

	}

}

