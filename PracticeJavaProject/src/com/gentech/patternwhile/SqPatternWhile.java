package com.gentech.patternwhile;
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/
public class SqPatternWhile {

	public static void main(String[] args) {
		int num=1;
		int i=0;
		while(i<4)
		{
			int k=0;
			while(k<=i)
			{
				System.out.print(num*num+" ");
				num++;
				k++;
			}
			System.out.println();
			i++;

		}


	}

}
