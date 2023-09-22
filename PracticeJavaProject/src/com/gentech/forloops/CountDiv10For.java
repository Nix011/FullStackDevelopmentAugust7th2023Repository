package com.gentech.forloops;

public class CountDiv10For {

	public static void main(String[] args) {
		int count=0;
		for(int i=250;i<=500;i++)
		{
			if(i%10==0)
			{
				count+=1;
			}
		}System.out.println(count);

	}

}
