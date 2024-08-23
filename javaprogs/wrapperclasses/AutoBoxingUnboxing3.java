package com.evergent.corejava.wrapperclasses;

public class AutoBoxingUnboxing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a Integr object 
		//with custom value say it be 10
		//Autoboxing
		int a=10;
		Integer i=new Integer(a);
		//unboxing
		int i1=i.intValue();
		//print statements
		System.out.println("Value of i"+i);
		System.out.println("Value of i1"+i1);
		//Autoboxing of character
		char ch1='a';
		Character myc=new Character(ch1);
		//Auto Unboxing
		char ch=myc.charValue();
		//print statements
		System.out.println("Value of ch"+ch);
		System.out.println("Value of Character"+ch);

	}

}
