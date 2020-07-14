package com.oppsMore;

public class Dog implements Animals{

	@Override
	public void Aniaml_sound() {
		System.out.println("BOW BOW");
		
	}

	@Override
	public void Sleep() {
		System.out.println("zz");
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.Aniaml_sound();
		dog.Sleep();
	}

}
