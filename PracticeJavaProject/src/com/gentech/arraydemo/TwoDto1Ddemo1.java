package com.gentech.arraydemo;

public class TwoDto1Ddemo1 {

	public static void main(String[] args) {
		int x[][]= {{1,4,5},{5,6,7},{6,5,7}};
		int a[]=new int[3*3];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				a[k]=x[i][j];
				k++;
			}
		}
		for(int z=0;z<a.length;z++)
		{
			System.out.print(a[z]+" ");
		}
	}
}