
public class Producer extends Thread {
	Buffer b = null;
	
	public Producer(Buffer b){
		this.b = b;
	}
	
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10; i++){
			System.out.println("生产者生产了产品" + i);
			Product p = new Product(i);
			this.b.push(p);
		}
	}

}
