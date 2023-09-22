package com.gentech.programs;

public class LargestOf3No {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if((a==b)&& (b==c)) {
			System.out.println(a+" is same as "+b+" and it is same as "+c);
		}
		else if((a>b)&&(a>c)) {
			System.out.println(a+" is greater than "+b+" & "+c);
		}
		else if ((b>a)&&(b>c)) {
			System.out.println(b+" is greater than " +a+" & "+c);
		}
		else {
			System.out.println(c+" is greater than " +a+" & "+b);
		}

	}

}
