package com.gentech.parameterizedconstructor;
class reverse
{
	reverse(int num)
	{
		int r=0;
		System.out.println("original num: "+num);
		while(num>0)
		{
			int last=num%10;
			r=r*10+last;
			num=num/10;
		}
		System.out.println("final reversed no :"+r);
	}
}
public class ReverseDemo {

	public static void main(String[] args) {
		reverse r1=new reverse(8768);
	}

}
