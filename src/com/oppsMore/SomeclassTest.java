package com.oppsMore;

public class SomeclassTest {
public static void main(String[] args) {
	Encapsulation_Test test = new Encapsulation_Test();
	
	test.setName("BOB");
	
	String name= test.getName();
	
	System.out.println(name);
	
	test.setName("JHON");
	
	System.out.println(test.getName());
	
	System.out.println(name);
}
}
