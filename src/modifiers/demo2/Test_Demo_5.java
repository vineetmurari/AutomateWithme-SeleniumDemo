package modifiers.demo2;

public class Test_Demo_5  {
	
public int b =5;

public final int meth(){
	return 12;
}
	
public static void main(String[] args) {
	
	Test_Demo_5 obj =  new Test_Demo_5();
	System.out.println(obj.b);
}
}
