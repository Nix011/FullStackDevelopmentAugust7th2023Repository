package com.gentech.patterns;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 */
public class NumPatternFor {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
				
			} System.out.println();
		}
	}

}
