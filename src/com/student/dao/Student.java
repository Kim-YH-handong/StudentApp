package com.student.dao;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age){
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		String printStudent = "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
		return printStudent;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
