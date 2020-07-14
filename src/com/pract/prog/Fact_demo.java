package com.pract.prog;

/**
 * 
 * 5! = 5*4*3*2*1=120
 * 
 * 
 *
 */



public class Fact_demo {
public static void main(String[] args) {
	
	int number =5;
	int res =1;

	for(int i=1;i<=number; i++){
		res *=i;
	}
	System.out.println(number+"! = "+res);
}
}
