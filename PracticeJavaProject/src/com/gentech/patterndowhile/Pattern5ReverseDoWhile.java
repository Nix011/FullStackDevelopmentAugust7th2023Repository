package com.gentech.patterndowhile;
/*
5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/
public class Pattern5ReverseDoWhile {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=5;
			do
			{
				System.out.print("5 ");
				k--;
			}while(k>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
