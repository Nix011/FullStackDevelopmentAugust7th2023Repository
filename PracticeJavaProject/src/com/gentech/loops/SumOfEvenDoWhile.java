package com.gentech.loops;

public class SumOfEvenDoWhile {

	public static void main(String[] args) {
		int sum=0,i=250;
		do
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}while(i<=500);
			System.out.println(sum);
	}

}
