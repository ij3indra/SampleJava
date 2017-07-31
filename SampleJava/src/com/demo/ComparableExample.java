package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
		//return (int) (this.id - o.id);
	}
	
}

public class ComparableExample {
	public static void main(String a[]){
		
		Student[] s = new Student[3];
		s[0] = new Student(1, "Jatin");
		s[1] = new Student(2, "D");
		s[2] = new Student(3, "Suthar");
		
		Arrays.sort(s);
		
	}
}
