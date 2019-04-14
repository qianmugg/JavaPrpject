
public class Drawing extends Thread{
	int drawingNum;
	Account account;
	int expenseTotal;
	
	public Drawing(int drawingNum, Account account){
		super();
		this.drawingNum = drawingNum; 
		this.account = account;
	}
	
	public void run(){
		draw();
	}
	
	void draw(){
		synchronized (account) {
			if(account.money - drawingNum < 0){
				System.out.println(this.getName() + "ȡ����㣡");
				return;
			}
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			account.money -= drawingNum;
			expenseTotal += drawingNum;
		}
		System.out.println(this.getName() + "�˻���" + account.money);
		System.out.println(this.getName() + "�ܹ�ȡ�ˣ�" + expenseTotal);
	}
	
}
