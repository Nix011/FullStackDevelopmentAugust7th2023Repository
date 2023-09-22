package com.gentech.parameterizedconstructor;
class vowels{
	vowels(char ch){
		switch(ch) {
		case 'A': case 'E': case 'I': case 'O': case 'U':case 'a':case 'e':case 'i': case 'o':case 'u':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is a consonant");
		}
	}
}
public class VowelDemo {

	public static void main(String[] args) {
		vowels v1=new vowels('A');
		vowels v2=new vowels('b');
		vowels v3=new vowels('e');
		vowels v4=new vowels('I');
		vowels v5=new vowels('Z');


	}

}
