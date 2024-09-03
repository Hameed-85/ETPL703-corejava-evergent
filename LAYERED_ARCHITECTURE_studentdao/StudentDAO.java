package com.evergent.corejava.studentdao;

import java.util.ArrayList;

public class StudentDAO {
	
	public int addstu(StudentBean sb) 
	{
		try 
		{
			ArrayList al=new ArrayList();
			al.add(sb.getStuId());
			al.add(sb.getSname());
			al.add(sb.getMarks());
			al.add(sb.getCourse());
			al.add(sb.getGrade());
			System.out.println(al);
			System.out.println("Student Id"+sb.getStuId());
			System.out.println("Student Name"+sb.getSname());
			System.out.println("Student Marks"+sb.getMarks());
			System.out.println("Student Course"+sb.getCourse());
			System.out.println("Student grade"+sb.getGrade());
			
			return 1;
		}
		catch(Exception e) 
		{
			return 0;
		}
		
	}

}
