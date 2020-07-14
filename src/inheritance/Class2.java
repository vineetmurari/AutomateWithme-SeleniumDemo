package inheritance;

public class Class2 extends Classone { //Inheritance

	int y=23;
	
	public static void main(String[] args) {
		Class2 obj1 = new Class2();
		System.out.println(obj1.y);
		
		Classone obj2 = new Class2();
		System.out.println(obj2.a);
		Classone.Print_something();
		
		//System.out.println(obj2.y); NOT POSSIBLE
	}
	
}
