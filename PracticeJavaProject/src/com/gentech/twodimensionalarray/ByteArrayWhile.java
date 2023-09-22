package com.gentech.twodimensionalarray;

public class ByteArrayWhile {

	public static void main(String[] args) {
		byte x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int i=x.length-1;
		while(i>=0)
		{
			int j=x[i].length-1;
			while(j>=0)
			{
				System.out.print(x[i][j]+" ");
				j--;
			}
			System.out.println();
			i--;
		}

	}

}
