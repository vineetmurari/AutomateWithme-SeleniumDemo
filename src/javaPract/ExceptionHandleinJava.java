package javaPract;

public class ExceptionHandleinJava {
	public static void main(String[] args) {
	int i =0;
	int j =10;
	int k =0;
	try{
		k =j/i; 
		System.out.println(k);
	}
	catch(Exception e){
		System.out.println("Something went Wrong .... "+e.getMessage());
	}
	
	System.out.println("WHAT ELSE.. LET'S Continue...");
	
	}
}
