package com.gentech.patternwhile;
/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 */
public class Pattern2While {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print("2 ");
				k++;
			}
			System.out.println();
			i++;

		}

	}}
