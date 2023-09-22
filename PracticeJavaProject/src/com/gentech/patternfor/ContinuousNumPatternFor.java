package com.gentech.patternfor;
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */
public class ContinuousNumPatternFor {

	public static void main(String[] args) {
		int num=1;
		for (int i=1;i<=5;i++)
		{
			for (int k=1;k<=i;k++) 
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
