package com.gentech.methodsdemo;
class loops
{
	void forloop() {
		System.out.println("using for loop:");
		for(int i=50;i>=40;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	void whileloop() 
	{
		int i=50;
		System.out.println("using while loop:");
		while(i>=40)
		{
			System.out.print(i+" ");
			i--;
		}System.out.println();
	}
	void dowhileloop()
	{
		int i=50;
		System.out.println("using do while loop:");
		do
		{
			System.out.print(i+" ");
			i--;
		}while(i>=40);
	}
}

public class PrintingNumDemo {

	public static void main(String[] args) {
		loops o1=new loops();
		o1.forloop();
		o1.whileloop();
		o1.dowhileloop();

	}

}
