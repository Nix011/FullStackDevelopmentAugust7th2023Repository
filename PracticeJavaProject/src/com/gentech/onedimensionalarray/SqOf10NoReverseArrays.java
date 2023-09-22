package com.gentech.onedimensionalarray;

public class SqOf10NoReverseArrays {

	public static void main(String[] args) {
		int x[]= new int[10];
		for (int i=x.length-1;i>=0;i--) {
			int num=i+1;
			x[x.length-1-i]=num*num;
		}
		for(int z=x.length/2;z<x.length;z++)
		{
			System.out.println(x[z]);
		}
	}

}

