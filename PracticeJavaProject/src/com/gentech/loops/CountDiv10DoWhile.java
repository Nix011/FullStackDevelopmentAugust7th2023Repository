package com.gentech.loops;

public class CountDiv10DoWhile {

	public static void main(String[] args) {
		int count=0,i=250;
		do
		{
			if(i%10==0)
			{
				count+=1;
			}
			i++;
		}while(i<=500);
		System.out.println(count);
	}

}
