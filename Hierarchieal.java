package pratice;

class SuperMarket{
	void biscuits() {
		System.out.println("milk biscuit");
		
	}
}
class Chips extends SuperMarket{
	void lays() {
		System.out.println("spicy");
	}
}
class Vegtable extends SuperMarket{
	void carrot() {
		System.out.println("vitamin c");
	}
}
public class Hierarchieal {

	public static void main(String[] args) {
		System.out.println("hierarchieal inheritance");
		Chips c=new Chips();
		Vegtable v=new Vegtable();
		c.biscuits();
		c.lays();
		v.carrot();
	
		
		

	}

}
