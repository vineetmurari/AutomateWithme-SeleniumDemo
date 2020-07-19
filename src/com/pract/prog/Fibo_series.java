package com.pract.prog;
/**
 * 
 * 0 1 1 2 3...........
 * 
 * 
 * 
 *
 */
public class Fibo_series {
	public static void Fibo(int count){
		int first=0;
		int second =1;
		int third =0;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<=count;i++){
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			
		}
	}
	
	public static void main(String[] args) {
		Fibo(9);
	}
}