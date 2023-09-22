package com.gentech.whileloop;

public class SumOfSqWhile {

	public static void main(String[] args) {
		int sum=0,i=20;
		while(i>=1)
		{
			sum=sum+(i*i);
			i--;
		}
		System.out.println(sum);
	}

}
