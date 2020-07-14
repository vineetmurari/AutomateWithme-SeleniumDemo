package javaPract;

public class StringsandExceptions {
	 public static void main(String[] args) {
		String a ="helloWorld";
		System.out.println("JUST PRINTING VALUE OF a ");
		System.out.println(a);
		
		System.out.println("PRINT CONCATINATION ");
		System.out.println(a+" "+ "Buddy!!");//helloWorld Buddy!!
		
		System.out.println("PRINT ADD TWO NUMBERS ");
		System.out.println(1+2);//3
		
		System.out.println("PRINT COntact two Strings...");
		System.out.println("1"+"2"); //12
		System.out.println("1"+2);//12
		
		System.out.println("PRINT LENGTH OF THE STRING");
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		
		System.out.println("PRINT SUBSTRING ");
		System.out.println(a.substring(0));
		System.out.println(a.substring(0,5));//Hello
		
		System.out.println("USE TO CHAR ARRAY FUNCTION");
		char [] arry_of_checters=a.toCharArray();
		for(char c:arry_of_checters){
			System.out.println(c);
		}
		System.out.println("LOWER CASE ");
		System.out.println(a.toLowerCase());
		System.out.println("UPPER CASE ");
		System.out.println(a.toUpperCase());
		
		System.out.println(" STRING TRIM ");
		String a1 =" Hello Buddy ";
		System.out.println(a1);
		
		System.out.println(a1.trim());
		
		System.out.println("CONVERT THE INTEGER VALUES AND FLOAT VALUES TO STRING");
		int i =1234;
		float j =1.234f;
		String text_number = String.valueOf(i);
		System.out.println(text_number);
		System.out.println(text_number+1);//12341
		
		
		String.valueOf(j);
		String text_number1 = String.valueOf(j);
		System.out.println(text_number1);
		
		System.out.println("CONVERT STRING TO NUMNERS");
		String Textual_num ="12345";
		String Textual_num1="1.23";
		int i1 = Integer.parseInt(Textual_num);
		float j1 =Float.parseFloat(Textual_num1);
		
		System.out.println(i1);
		System.out.println(j1);
		
		String Var12="This is %1$s";
		Var12= String.format(Var12, "String variable");
		System.out.println(Var12);
		
		
	}
}
