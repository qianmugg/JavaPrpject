
public class TestSysc {

	public static void main(String[] args) {
		Account a1 = new Account(100, "Εν");
			Drawing draw1 = new Drawing(80, a1);
			Drawing draw2 = new Drawing(80, a1);
			Drawing draw3 = new Drawing(60, a1);
			draw1.start();	
			draw2.start();	
			draw3.start();
	}

}
