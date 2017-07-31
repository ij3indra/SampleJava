package com.demo;

class A{
	public A(){
		System.out.println("Creating A");
	}
	void printA(){
		System.out.println("Printing A");
	}
}
 class B extends A{
	public B(){
		super();
		System.out.println("Creating B");
	}
	void printB(){
		System.out.println("Printing B");
	}
	/*void printA(){
		System.out.println("In B Printing A");
	}*/
}

public class InheitanceExample {
	public static void main(String a[]){
		/*B b = new B();
		A a1 = new A();*/
		A a2 = new B();
		
		/*b.printB();
		b.printA();
		a1.printA();*/
		
		a2.printA();
		
	}
}
