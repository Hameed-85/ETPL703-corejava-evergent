package com.evergent.corejava.collections2;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet se=new TreeSet();
		se.add(100);
		se.add(40);
		se.add(45);
		se.add(30);
		System.out.println(se);
		Iterator i=se.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}

}
