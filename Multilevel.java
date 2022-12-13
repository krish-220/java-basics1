package pratice;


class Bike{
	void run() {
		//System.out.println("running");
	}
}
class Splendor extends Bike{
	void millege() {
		System.out.println("milleage is 60km");
	}
}
class Duke extends Splendor{
	void race() {
		System.out.println("racing bike");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		System.out.println("multilevel inheritance");
		Duke u = new Duke();
		u.run();
		u.millege();
		u.race();

	}

}
