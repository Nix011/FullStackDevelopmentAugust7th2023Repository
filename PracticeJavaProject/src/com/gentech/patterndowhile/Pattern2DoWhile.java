package com.gentech.patterndowhile;
/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 */
public class Pattern2DoWhile {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print("2 ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);


	}

}
