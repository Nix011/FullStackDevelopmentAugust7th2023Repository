package com.gentech.programs;

public class LargestOf2No {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a==b) {
			System.out.println(a+ " is same as "+b);
		}
		else if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than" +a);
		}

	}

}
