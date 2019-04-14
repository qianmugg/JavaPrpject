
public class Customer extends Thread {
	Buffer b = null;
	public Customer(Buffer b){
		this.b = b;
	}
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10; i++){
			this.b.pop();
			System.out.println("消费者消费了产品" + i);
		}
	}

}
