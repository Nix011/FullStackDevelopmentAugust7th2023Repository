package com.gentech.dowhileloops;

public class CubeDoWhile {

	public static void main(String[] args) {
		int sum=0,i=1;
		do
		{
			sum=sum+(i*i*i);
			i++;
		}while(i<=10);
		{
			System.out.println(sum);	
		}



	}

}
