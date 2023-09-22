package com.gentech.arraydemo;

import java.util.Arrays;

public class MultiplicationDemo {

	public static void main(String[] args) {
		int a[][] = {{1, 2, 3}, {4, 5, 6}};
		int b[][] = {{7, 8}, {9, 10}, {11, 12}};

		//[(1*7)+(2*9)+(3*11)]  [(1*8)+(2*10)+(3*12)]
		//[(4*7)+(5*9)+(6*11)]  [(4*8)+(5*10)+(6*12)]

		//[58][64]
		//[139][154]

		int aRows = a.length;
		int aCols = a[0].length;
		//int bRows = b.length;
		int bCols = b[0].length;

		if(aRows == bCols) {
			int c[][] = new int[aRows][bCols];
			for(int i=0; i<aRows; i++) {
				for(int j=0; j<bCols; j++) {
					for(int k=0; k<aCols; k++) {
						c[i][j]+= a[i][k] * b[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(c));
		}else {
			System.out.println("Can't perform Matrix Multiplication.");
		}
	}
}


