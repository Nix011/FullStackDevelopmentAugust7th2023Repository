package com.gentech.forloops;

public class SumOfEvenFor {

	public static void main(String[] args) {
		int sum=0;
		for(int i=250;i<=500;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}System.out.println(sum);

	}

}
