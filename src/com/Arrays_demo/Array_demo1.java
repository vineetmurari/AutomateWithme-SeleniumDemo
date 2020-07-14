package com.Arrays_demo;

import java.util.Arrays;

public class Array_demo1 {
	
public static void main(String[] args) {
	
	
	
	int[] i= new int[3];
	
	i[0]=11;
	i[1]=22;
	i[2]=32;
	
	
	
	int[] k = new int[]{1,2,3, 4, 5};//3
	
	for(int index=0; index<i.length; index++){
		System.out.println(i[index]);//i[0]
	}
	
	
	System.out.println("-------------------------------------------");
	
	for(int ele:k ){
		System.out.println(ele);
	}
	System.out.println("-------------------------------------------------------");
	
	/*
	 * 1D - [1,2,3,4]
	 * 
	 * 2D- [1,2,3
	 * 	 	4,5,6]
	 */
	
	int j[]={1,2,3};  
	
	for(int ele:j ){
		System.out.println(ele);
	}
	
	//opration
	System.out.println("operation");
	j[0]=200;
	
	for(int ele:j ){
		System.out.println(ele);
	}
	
	System.out.println("------------------------------=====================");
	
	int [][] arr= new int[][]	{{1, 2, 3}, 
								{5, 6, 7}};
	
	int[][] i2= new int[3][3];
	i2[0][0]=1;
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	for(int row =0; row<arr.length; row++){
		for(int col =0; col<arr[row].length;col++){
			System.out.println(arr[row][col]);
		}
	}
	
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	String arr1[] = new String[]{"v","p","o"};
	
	for(String element :arr1 ){
		System.out.println(element);
	}
	
	System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}");
	
	Employee[] emp_arry =new Employee[2];
	
	emp_arry[0]=new Employee("BOB","12334");
	emp_arry[1]=new Employee("JHON","123345");
	
	for(Employee emp:emp_arry ){
		System.out.println(emp.EmP_name);
		System.out.println(emp.EmP_ID);
	}
	
	System.out.println(emp_arry[0]);
	
	System.out.println("())()()()()()(");
	
	int a[] = new int[]{5,3,4};
	
	int a1[] = new int[]{5,3,5};
	
	boolean flag = Arrays.equals(a, a1);
	if(flag){
		System.out.println("TRUE");
	}
	else{
		System.out.println("FALSE");
	}
	
	for(int emp:a ){
		System.out.println(emp);
	}
	System.out.println("())()()()()()(");
	Arrays.sort(a);
	for(int emp:a ){
		System.out.println(emp);
	}
	
	
}


}
