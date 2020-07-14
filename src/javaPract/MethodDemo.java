package javaPract;

public class MethodDemo {
	

	public void Just_print_mystmt(String text){
		System.out.println(text);
	}
	
	public  static void  Just_print_mystmt(){
		System.out.println("text");
	}
	
	
	public int Add_two_numbers(int number1, int number2){
		
		int sumoftwoNumbers = number1+number2;
		
		return sumoftwoNumbers;
	}
	
	public static void main(String[] args) {
		
		MethodDemo object = new MethodDemo();
		String var = "my text";
		object.Just_print_mystmt(var);
		
		// Scenario is to use the number 1 and 2 to add them and print
	
		int result = object.Add_two_numbers(1, 2);
		
		System.out.println(result);
		
		MethodDemo.Just_print_mystmt();
		
	}
	
}
