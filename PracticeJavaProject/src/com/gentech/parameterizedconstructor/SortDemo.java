package com.gentech.parameterizedconstructor;
class sort{
	sort(int a[]){
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		System.out.println("array in ascending order:");
		for(int k=1;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
public class SortDemo {

	public static void main(String[] args) {
		int a[]= {19,2,55,32,24};
		sort s1=new sort(a);

	}

}
