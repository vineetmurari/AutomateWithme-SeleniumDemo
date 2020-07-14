package javaPract;

public class Condions {
	
	public static void main(String[] args) {
		int a=20;
		int b =10;
		
		/*
		 * >, <, ==, !
		 * 
		 */
		
		
		if(a>b){
			System.out.println("Yes a is grester than b");
		}
		else if(b>a){
			System.out.println("Yes b is greater than a");
		}
		else{
			System.out.println("neither of them are greater");
		}
		
		int a1 =2;
		int a2 =2;
		
		if(a1<=a2){
			System.out.println("Yes that's true");
		}
		else{
			System.out.println("No");
		}
		
		
		boolean A = true;
		if(!A){
			System.out.println("YEAH");
		}
		else{
			System.out.println("Nope");
		}

	}
}
