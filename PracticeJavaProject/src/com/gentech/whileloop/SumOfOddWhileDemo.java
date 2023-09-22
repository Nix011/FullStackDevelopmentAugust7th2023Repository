package com.gentech.whileloop;

public class SumOfOddWhileDemo {

	public static void main(String[] args) {
		int sum=0,i=50;
		while(i<=100)
		{
			if(i%2==1) {
			sum+=i;
			
		}i++;
			}System.out.println(sum);

	}

}
