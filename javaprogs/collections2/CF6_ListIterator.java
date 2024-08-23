package com.evergent.corejava.collections2;
import java.util.*;

public class CF6_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("Ramu");
		list.add("Ravi");
		list.add("Balu");
		list.add("Bhanu");
		ListIterator li=list.listIterator();
		li.add("Welcome");
		while(li.hasNext()) 
		{
			String s=(String) li.next();
			System.out.println(s);
			if(s.equals("Balu")) {
				li.remove();
			}
			
		}
		while(li.hasPrevious()) 
		{
			System.out.println(li.previous());
		}
		
	}

}
