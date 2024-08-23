package com.evergent.corejava.collections2;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList se=new ArrayList();
		se.add(100);
		se.add("Hello");
		se.add(45.5);
		se.add("Welcome");
		System.out.println(se);
		Iterator i=se.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}

}
