package com.evergent.corejava.studentdao;

import java.util.Scanner;

public class StudentMainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id");
		int StuId=sc.nextInt();
		System.out.println("Enter Student Name");
		String Snam=sc.next();
		System.out.println("Enter Marks");
		 int marks=sc.nextInt();
		 System.out.println("Enter Course");
		 String course=sc.next();
		 StudentSerrvice ss=new StudentSerrvice();
		 int m=ss.add(StuId, Snam, marks, course);
		 System.out.println("Inserted"+m+"record Success");

	}

}
