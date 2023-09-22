package com.gentech.onedimensionalarray;

public class Reverse100to50Div4Arrays {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
		}
		System.out.println("count ="+count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=0;z<x.length;z++)
		{
			System.out.println(x[z]);
		}

	}

}
