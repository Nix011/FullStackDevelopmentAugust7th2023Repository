package com.gentech.patternwhile;
/*
5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/
public class Pattern5ReverseWhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=5;
			while(k>=i)
			{
				System.out.print("5 ");
				k--;
			}
			System.out.println();
			i++;

		}

	}

}
