package com.gentech.patternfor;
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/
public class SqPatternFor {

	public static void main(String[] args) {
        int num=1;

        for (int i=0;i<4;i++)
        {
            for (int k=0;k<=i;k++) {
                System.out.print(num*num+ " ");
                num++;
            }
            System.out.println();
        }

	}

}
