package pratice;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Method Overloading");
		add(5,5);

	}


	static void add(int num1) {
		System.out.println(num1 + num1);
	}
	static void add(int num1,int num2) {
		System.out.println(num1 +num2);
	}

}
