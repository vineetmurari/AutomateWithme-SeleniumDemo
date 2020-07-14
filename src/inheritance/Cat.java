package inheritance;

public class Cat extends Animal {
	
	public void Sound(){
		System.out.println("Meow");
	}
	
	public void My_parents_Sound(){
		super.Sound();
	}
	
	// Same method name same arg -> overriding Concept.. 
	//Overloading means - same name but different Args - Dont need Inhertance
	
	public void walks(){    
		
		System.out.println("WAlking..");
	}
	public void walks(int km){
		System.out.println("WAlking.."+ km);
	}
	
}
