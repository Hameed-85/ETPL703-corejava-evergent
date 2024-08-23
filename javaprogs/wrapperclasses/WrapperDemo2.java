package com.evergent.corejava.wrapperclasses;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=4.5f;
		int i=100;
		Integer t1=new Integer(i);
	    int t2=t1.intValue();
	    double d1=799.89;
	    Double d2=new Double(d1);
	    double t3=d2.doubleValue();
	    byte b1=10;
	    Byte b2=new Byte(b1);
	    byte bb3=b2.byteValue();
	    System.out.println("Int value is"+i);
	    System.out.println("Int ObjectValue is"+t1);
	    System.out.println("Convert integer Object value to Primitive"+t2);
	    System.out.println("Double value is"+d1);
	    System.out.println("Double ObjectValue is"+d2);
	    System.out.println("Convert Double Object value to Primitive"+t3);
	    System.out.println("byte value is"+b1);
	    System.out.println("Byte ObjectValue is"+b2);
	    System.out.println("Convert Byte Object value to Primitive"+bb3);
	    
	    
	    
	    

	}

}
