
public class Test {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producer p = new Producer(b);
		Customer c = new Customer(b);
		p.start();
		c.start();

	}

}
