package com.gentech.onedimensionalarray;

public class CombinationArray {

	public static void main(String[] args) {
		int a[]={2,4,6,8};
		int b[]={10,20,30,40,50,60};
		int total=a.length+b.length;
		int c[] =new int[total];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		for(int k=0;k<total;k++) {
			System.out.println(c[k]);
		}

	}

}
