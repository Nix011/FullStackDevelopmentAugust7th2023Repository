package com.gentech.whileloop;

public class SumOfEvenWhile {

	public static void main(String[] args) {
		int sum=0,i=250;
		while(i<=500)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
