package com.evergent.corejava.studentdao;

public class StudentSerrvice {
	public int add(int id,String name,int marks,String course) 
	{
		String grade="";
		if( marks<35) 
		{
			grade="C";
		}
		else if(marks<=50) 
		{
			grade="B";
		}
		else if(marks<90) 
		{
			grade="A";
			
		}
		else 
		{
			grade="Ex";
		}
		StudentBean sb=new StudentBean();
		sb.setStuId(id);
		sb.setSname(name);
		sb.setMarks(marks);
		sb.setCourse(course);
		sb.setGrade(grade);
		StudentDAO sd=new StudentDAO();
		int t=sd.addstu(sb);
		return t;
	}

}
