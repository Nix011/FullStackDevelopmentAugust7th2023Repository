package com.gentech.arraydemo;

public class DoubleScalarMatrix {

	public static void main(String[] args) {
		double x[][]= {{1.1,2.2,3.3},{4.4,5.5,6.6},{7.7,8.8,9.9}};
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				
				System.out.print(x[i][j]*2+" ");
			}
			System.out.println();
		}


	}

}
