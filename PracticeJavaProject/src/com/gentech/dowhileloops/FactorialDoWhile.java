package com.gentech.dowhileloops;

public class FactorialDoWhile {

	public static void main(String[] args) {
		int i=1,fact=1;
		int num=Integer.parseInt(args[0]);
		do
		{
			fact*=i;
			i++;
		}while(i<=num);
		System.out.println(fact);
	}

}
