package com.gentech.patterndowhile;
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/
public class ContinuousReverseNumDoWhile {

	public static void main(String[] args) {
		int num=15;
		int i=5;
		do 
		{
			int k=1;
			do
			{
				System.out.print(num+" ");
				num--;
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);


	}

}
