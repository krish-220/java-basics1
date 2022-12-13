package pratice;


class Loop{
	int i;
	void number(){
		for(int i=100; i>=0; i--) {
			//if(i==10) {
				//break;
			//}
			if(i==20) {
				continue;
			}
			System.out.println(i);
		}
	}
}

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("forloop");
		Loop num = new Loop();
		num.number();
		

	}

}
