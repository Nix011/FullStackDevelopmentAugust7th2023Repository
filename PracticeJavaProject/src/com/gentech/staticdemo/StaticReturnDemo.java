package com.gentech.staticdemo;
class maths1
{
	static char[][] reverse(char x[][])//return given 2D 3*3 char array in reverse order
	{
		char y[][] = new char[x.length][x[0].length];
		for (int i = 0; i <x.length; i++) {
			for (int j = 0; j <x[0].length; j++) {
				y[i][j] = x[x.length - i - 1][x[0].length - j - 1];
			}
		}
		return y;
	}
	static char[][] concat(char x[][], char y[][]) //return concatenation result of 2D 3*3 char array
	{
		char result[][]=new char[3][6];

		for (int i =0;i<3;i++) {
			for (int j=0;j<3;j++) {
				result[i][j] =x[i][j];
				result[i][j+3]=y[i][j];
			}
		}
		return result;
	}
	static char[] FirstRow(char x[][]) //return the 1st row of elements from 2D 3*3 char array
	{
		char y[]=new char[x[0].length];
		for (int i=0;i<x[0].length;i++) {
			y[i]=x[0][i];
		}
		return y;
	}
	static String Alphabets() //return 26 upper case alphabets
	{
		char[] alphabet = new char[26];
		char cc = 'A';
		for (int i = 0; i < 26; i++) {
			alphabet[i] = cc;
			cc++;
		}
		return new String(alphabet);
	}
	static String FirstHalfUppercaseAlphabets()//return 1st half of the upper case alphabets
	{
		char[] result = new char[13];   
		for (int i=0;i<13;i++) {
			result[i]=(char) ('A'+i);
		}
		return new String(result);
	}
	static String SecondHalfUppercaseAlphabets()
	{
		char[] a = new char[13];
		int i=0;
		char currentChar='N';
		while (i<13) {
			a[i++] = currentChar++;
		}
		return new String(a);
	}
	static char[] LowerCaseAlphabets() 
	{
		char res[]=new char[26];
		for(char i=0;i<2;i++)
		{
			res[i]=(char)('a'+i);
		}
		return res;
	}
	static boolean isPrime(int num) {
		if (num<2) {
			return false;
		}
		for (int i=2;i<=num;i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	void printprimes(int start,int end) 
	{

		for (int i=start;i<=end;i++) {
			if (isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}
	}
	static int sumofprimes() {//return sum of prime no.s in between 1 to 100
		int sum = 0;
		for (int i = 2; i <= 100; i++)
		{
			boolean Prime = true;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					Prime = false;
					break;
				}
			}
			if (Prime) 
			{
				sum += i;
			}
		}
		return sum;
	}
	/* static boolean isprime(int num)
	  {
	  int flag=0;
	  for(int i=2;i<num;i++)
	  {
	  if(num%i==0)
	  {
	  flag+=1;
	  break;
	  }
	  }
	  if(flag==0)
	  return true;
	  else
	  return false;
	  }
	  static int getprimenumbersum(int start,int end)
	  {
	  int sum=0;
	  for(int i=start;i<=end;i++)
	  {  
	  if(isprime(i)==true)
	  {
	  sum=sum+i;
	  }}
	  return sum;
	 }
	 */

}

public class StaticReturnDemo {

	public static void main(String[] args) {
		maths1 m=new maths1();
		char[][] a={{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
		char[][] b={{'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r'}};
		char[][] c=maths1.concat(a,b);
		System.out.println("concatenation: ");
		for (int i=0;i<3;i++) {
			for (int j=0;j<6;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");

		char[][] d = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}
		};
		System.out.println("1st row of elements: ");
		char[] fr = maths1.FirstRow(d);
		for (char e : fr) {
			System.out.print(e+" ");
		}
		System.out.println();

		System.out.println("-----------------------------------------------");
		String alphabets = maths1.Alphabets();
		System.out.println("26 upper case alphabets: ");
		System.out.println(alphabets+" ");

		System.out.println("-----------------------------------------------");
		String firstHalf = maths1.FirstHalfUppercaseAlphabets();
		System.out.println("1st half of the uppercase alphabets: ");
		System.out.println(firstHalf);

		System.out.println("-----------------------------------------------");
		String secondHalf = maths1.SecondHalfUppercaseAlphabets();
		System.out.println("2nd half of the upper case alphabets: ");
		System.out.println(secondHalf);

		System.out.println("-----------------------------------------------");
		System.out.println("lower case alphabets: ");
		char[] ch=maths1.LowerCaseAlphabets();
		for(char hh:ch)
		{
			System.out.print(hh+" ");
		}

		System.out.println("-----------------------------------------------");
		System.out.println("print prime no.s from 1 to 50: ");
		//System.out.println(maths1.printprime());


		System.out.println("-----------------------------------------------");
		System.out.println("sum of prime no.s from 1 to 100: ");
		int gg=maths1.sumofprimes();
		System.out.println(gg+" ");

		System.out.println("-----------------------------------------------");


	}

}

