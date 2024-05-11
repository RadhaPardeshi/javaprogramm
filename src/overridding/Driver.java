package overridding;

public class Driver {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.shiftGear ();
		b.start();
		System.out.println("------------------");
		Car c = new Car ();
		c.shiftGear ();
		c.start();
		System.out.println("------------------");
		}

}
