package com.wp.pofo.entity;

public class Student {
	private int studno;
	private String dept;
	private String name;
	private int grade;
	private String tel;
	private String email;
	
	public Student() {
	}
	
	public Student(int studno, String dept, String name, int grade, String tel, String email) {
		super();
		this.studno = studno;
		this.dept = dept;
		this.name = name;
		this.grade = grade;
		this.tel = tel;
		this.email = email;
	}
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Students [studno=" + studno + ", dept=" + dept + ", name=" + name + ", grade=" + grade + ", tel=" + tel
				+ ", email=" + email + "]";
	}
}