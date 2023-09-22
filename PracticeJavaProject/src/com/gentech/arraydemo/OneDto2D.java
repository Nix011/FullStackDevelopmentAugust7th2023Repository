package com.gentech.arraydemo;

public class OneDto2D {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6};
		int temp[][]=new int[2][3];
		int k=0;
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				temp[i][j]=x[k];
				k++;
			}
		}

		for(int m=0;m<temp.length;m++)
		{
			for(int n=0;n<temp[0].length;n++)
			{
				System.out.print(temp[m][n]+" ");
			}
			System.out.println();

		}
	}
}