package pratice;

class DoWhile1{
	void number(){
		int i =0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
}

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("dowhile");
		DoWhile1 num = new DoWhile1();
		num.number();
		

	}

}
