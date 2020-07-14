package com.oppsMore;

public class Pig extends Animal {

	@Override
	public void Animal_sound() {
	System.out.println("WEE WEE");
		
	}
		
	
	@Override
	public int NoOfLegs() {
		
		return 4;
	}
	
	public static void main(String[] args) {
	
		Pig pig  = new Pig();
		pig.Animal_sound();
		pig.sleep();
		int no=pig.NoOfLegs();
		System.out.println("No. of Legs is "+no);
		
	}


	

}
