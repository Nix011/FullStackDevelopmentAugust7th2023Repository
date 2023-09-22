package com.gentech.twodimensionalarray;

public class Reverse2DStringArrayDemo {

	public static void main(String[] args) {
		String S[][]= {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
		for(int i=S.length-1;i>=0;i--)
		{
			for(int j=S[i].length-1;j>=0;j--)
			{
				System.out.print(S[i][j]+" ");
			}
			System.out.println();
		}

	}

}
