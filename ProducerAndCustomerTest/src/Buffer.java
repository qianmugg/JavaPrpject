
public class Buffer {
	int count = 0;      //�������ڲ�Ʒ��ֵ
	Product[] product = new Product[10];   //�����������ÿռ��ֵ
	
	public synchronized void push(Product product){
		while(count == this.product.length){ //����������
			try {
				this.wait(); //�ȴ��������������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();  //������û������Ӳ�Ʒ
		this.product[count] = product;
		count++;
	}
	
	public synchronized Product pop(){
		while(count == 0){ //�������ǿյģ�û����Դ������
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
