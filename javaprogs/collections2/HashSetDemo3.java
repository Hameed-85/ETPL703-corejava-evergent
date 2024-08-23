package com.evergent.corejava.collections2;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet se=new HashSet();
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
