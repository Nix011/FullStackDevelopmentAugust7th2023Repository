package com.gentech.patterns;
/* # # # # # #
   # # # # # #	
   # # # # # #  (while loop) */
public class PatternDemo {

	public static void main(String[] args) {
		int i=1;
		while(i<=3)
		{
			int k=1;
			while(k<=6)
			{
				System.out.print("# ");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
