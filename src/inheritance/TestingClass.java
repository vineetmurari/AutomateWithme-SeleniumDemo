package inheritance;

public class TestingClass {
		
public static void main(String[] args) {
	
	Animal animal = new Animal();
	animal.Sound();
	
	
	Cat cat = new Cat();
	cat.Sound();
	
	
	
	Dog dog = new Dog();
	dog.Sound();
	
	cat.My_parents_Sound();
	
	cat.walks();
	cat.walks(12);
	
}
}
