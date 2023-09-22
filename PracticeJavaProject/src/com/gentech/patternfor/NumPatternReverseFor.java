package com.gentech.patternfor;
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
public class NumPatternReverseFor {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
				
			} System.out.println();
		}

	}

}
