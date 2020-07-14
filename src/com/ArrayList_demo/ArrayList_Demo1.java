package com.ArrayList_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Demo1 {
public static void main(String[] args) {
	
	ArrayList<Integer> list1= new ArrayList<Integer>();
	ArrayList<Integer> list2= new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	
	System.out.println(list1.get(0));
	
	System.out.println("list1 contents "+list1);
	System.out.println("list2 contents "+list2);
	
	
	list2.addAll(list1);
	System.out.println("list2 contents "+list2);
	
	
	if(list1.equals(list2)){
		System.out.println("EQUal");
	}
	else{
		System.out.println("NOT");
	}
	
	
	ArrayList<Employee> emp_list = new ArrayList<Employee>();
	
	emp_list.add(new Employee("BOB", "12334"));
	
	System.out.println(emp_list.get(0).EmP_ID);
	
	ArrayList<Float> list3 = new ArrayList<Float>();
	list3.add(3.16f);
	list3.add(3.14f);
	list3.add(3.12f);
	
	for(int index=0; index<list3.size();index++){
		System.out.println(list3.get(index));
	}
	
	Collections.sort(list3);
	
	for(int index=0; index<list3.size();index++){
		System.out.println(list3.get(index));
	}
}
}
