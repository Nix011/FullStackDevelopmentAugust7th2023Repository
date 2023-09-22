package com.gentech.patterndowhile;
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/
public class SqPatternDoWhile {

	public static void main(String[] args) {
		int num=1;
		int i=0;
		do 
		{
			int k=0;
			do
			{
				System.out.print(num*num+" ");
				num++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<4);

	}

}
