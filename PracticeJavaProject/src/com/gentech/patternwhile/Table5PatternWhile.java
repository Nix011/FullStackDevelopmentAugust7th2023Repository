package com.gentech.patternwhile;
/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/
public class Table5PatternWhile {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(5*num+" ");
				num++;
				k++;
			}
			System.out.println();
			i++;

		}

	}

}
