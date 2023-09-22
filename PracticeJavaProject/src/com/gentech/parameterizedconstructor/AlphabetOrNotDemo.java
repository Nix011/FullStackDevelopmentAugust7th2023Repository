package com.gentech.parameterizedconstructor;
class alphabet{
	alphabet(char c){
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println(c+" is an alphabet");
		}
		else
		{
			System.out.println(c+" is not an alphabet");
		}
	}
}
public class AlphabetOrNotDemo {

	public static void main(String[] args) {
		alphabet a1=new alphabet('1');
		alphabet a2=new alphabet('a');
		alphabet a3=new alphabet('4');
		alphabet a4=new alphabet('Z');
		

	}

}
