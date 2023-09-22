package com.gentech.arraydemo;

public class Addition2Transpose {

	public static void main(String[] args) {
		int x[][]= {{1,2},{3,4}};
		int y[][]= {{10,20},{30,40}};
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			int z[][]=new int[x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[j][i]+y[j][i];
				}
			}
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

