package com.evergent.corejava.wrapperclasses;

public class WrapperDEmo1 {

	public static void main(String[] args) {
		// Automatic into object
		int a=100;
		Integer i1=new Integer(a);
		System.out.println(i1);
		//object values convert into primmitives
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
