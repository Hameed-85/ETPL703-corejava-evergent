package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		Integer i1=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		System.out.println(mylist);
		Integer i2=new Integer(200);
		mylist.add(i2);
		System.out.println(mylist);
		mylist.add(new Integer(45));
		System.out.println("My List");
		System.out.println(mylist.get(1));
		ArrayList mylist1=new ArrayList();
		mylist1.add(100);
		System.out.println(mylist1.get(0));
	}

}
