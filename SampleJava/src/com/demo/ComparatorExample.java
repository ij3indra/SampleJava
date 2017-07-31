package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name;
	String rollNo;
	String grade;
	
	public Student() {}
	
	public Student(int id, String name, String rollNo, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	//To sort student by id
	public static Comparator<Student> IdComparator = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2){
			return s1.getId() - s2.getId();
		}
	};
	
	//To sort student by name
	public static Comparator<Student> NameComparator = new Comparator<Student>() {
		
		public int compare(Student s1, Student s2){
			return s1.getName().compareTo(s2.getName());
		}
	};

}

public class ComparatorExample {
	public static void main(String a[]){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "J", "R001", "A"));
		studentList.add(new Student(2, "A", "R003", "B"));
		studentList.add(new Student(3, "K", "R002", "X"));
		
		//sort by id
		Collections.sort(studentList, Student.IdComparator);
		
		//sort by name
		Collections.sort(studentList, Student.NameComparator);
	}
}
