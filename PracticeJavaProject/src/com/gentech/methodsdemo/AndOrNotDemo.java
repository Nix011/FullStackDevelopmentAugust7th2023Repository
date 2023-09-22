package com.gentech.methodsdemo;
class operators{
	void AndOp(boolean x,boolean y) 
	{
		boolean c=x&&y;
		System.out.println(x+" and "+y+": "+c);
	}
	void OrOp(boolean x,boolean y) {
		boolean c=x||y;
		System.out.println(x+" or "+y+": "+c);
	}
	void NotOp(boolean x) {
		boolean c=!x;
		System.out.println("not "+x+": "+c);
	}
}
public class AndOrNotDemo {

	public static void main(String[] args) {
		operators o1=new operators();
		boolean a=true;//1
		boolean b=false;//0
		o1.AndOp(a,a);
		o1.AndOp(a, b);
		o1.AndOp(b, a);
		o1.AndOp(b, b);
		System.out.println("--------------------------------------");
		o1.OrOp(a, a);
		o1.OrOp(a, b);
		o1.OrOp(b, a);
		o1.OrOp(b, b);
		System.out.println("--------------------------------------");
		o1.NotOp(a);
		o1.NotOp(b);
	}

}
