package com.evergent.corejava.studentdao;

public class StudentBean {
	private int StuId;
	private String Sname;
	private int marks;
	private String course;
	private String grade;
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}
