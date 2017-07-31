package com.demo;

interface IntExample{
	 void getPrice();
}

class Price implements IntExample{
	public void getPrice(){
		System.out.println("Getting price");
	}
}

public class InterfaceExample {
	public static void main(String a[]){
		Price p = new Price();
		p.getPrice();
	}
}
