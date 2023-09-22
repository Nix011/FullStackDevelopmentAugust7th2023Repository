package com.gentech.parameterizedconstructor;
class palindrome
{
	palindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0) 
		{
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(rev+" is palindrome");
		}
		else
		{
			System.out.println(rev+" not palindrome");
		}
	}
}
public class PalindromeDemo {

	public static void main(String[] args) {
		palindrome p1=new palindrome(1001);
		palindrome p2=new palindrome(9856);

	}

}
