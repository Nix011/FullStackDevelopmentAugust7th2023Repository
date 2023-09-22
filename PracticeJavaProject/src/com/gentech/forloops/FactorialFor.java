package com.gentech.forloops;

public class FactorialFor {

	public static void main(String[] args) {
		int fact=1;
		int num=Integer.parseInt(args[0]);
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}
