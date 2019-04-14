
public class Buffer {
	int count = 0;      //缓冲区内产品初值
	Product[] product = new Product[10];   //缓冲区内闲置空间初值
	
	public synchronized void push(Product product){
		while(count == this.product.length){ //缓冲区满了
			try {
				this.wait(); //等待消费者消费完成
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();  //缓冲区没满就添加产品
		this.product[count] = product;
		count++;
	}
	
	public synchronized Product pop(){
		while(count == 0){ //缓冲区是空的，没有资源可拿走
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		count--;
		return this.product[count];
	}
}
