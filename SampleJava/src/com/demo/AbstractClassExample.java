package com.demo;

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	void draw(){
		System.out.println("Drawing circle");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing rectangle");
	}
}

public class AbstractClassExample {
	public static void main(String a[]){
		Shape circle = new Circle();
		circle.draw();
		
		Rectangle rect = new Rectangle();
		rect.draw();
	}
}
