package com.gentech.whileloop;

public class CubeWhile {

	public static void main(String[] args) {
		int sum=0,i=1;
		while(i<=10)
		{
			sum=sum+(i*i*i);
			i++;
		}
		System.out.println(sum);

	}

}
