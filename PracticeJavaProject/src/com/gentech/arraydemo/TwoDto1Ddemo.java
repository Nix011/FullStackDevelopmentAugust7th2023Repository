package com.gentech.arraydemo;

public class TwoDto1Ddemo {

	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int temp[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				temp[i][j]=x[i][j];
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.print(temp[i][j]+" ");
			}

		}

	}
}


