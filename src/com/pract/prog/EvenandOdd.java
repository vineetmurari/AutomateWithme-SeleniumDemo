package com.pract.prog;
/**
 * 
 * Even - div by 2 and Rem 0 / %
 * ODD
 * 
 * 
 *
 */
public class EvenandOdd {

	public static boolean CheckIfGivenNumberisEven(int num){
		
		boolean res =false;
		
		if(num%2==0){
			res=true;
		}
		return res;	
	}
	
	public static void main(String[] args) {
		
		boolean isEven = CheckIfGivenNumberisEven(100);
		
		System.out.println(isEven);
		
	}
	
	
}
