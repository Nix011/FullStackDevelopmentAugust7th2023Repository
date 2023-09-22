package com.gentech.patterndowhile;
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/
public class RepeatingPatternDoWhile {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(i+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
