package com.gentech.loops;

public class CountDiv10While {

	public static void main(String[] args) {
		int count=0,i=250;
		while(i<=500)
		{
			if(i%10==0)
			{
				count+=1;
			}
			i++;
			
		}System.out.println(count);

	}

}
