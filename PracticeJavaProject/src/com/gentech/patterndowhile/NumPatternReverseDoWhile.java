package com.gentech.patterndowhile;
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
public class NumPatternReverseDoWhile {

	public static void main(String[] args) {
		int i=5;
		do 
		{
			int k=1;
			do
			{
				System.out.print(k+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
