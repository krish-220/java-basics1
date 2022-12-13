package pratice;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("barking");
		
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println("SingleInheritance");
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		

	}

}
