package interfaceTest;

import inheritance.TestingClass;

public class Class_test implements Interface1 {

	@Override
	public void test3() {
		System.out.println("tset3");
		
	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args){
		Interface1 obj = new Class_test();
		obj.test1();
		obj.test2();
		obj.test3();
	}
}
