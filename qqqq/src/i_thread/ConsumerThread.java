package i_thread;

public class ConsumerThread extends Thread {
	private DataBox databox;
	
	public ConsumerThread(DataBox databox) {
		this.databox= databox;  //������ü�� �ʵ忡 ����.
	}
	
	public void run() {
		for(int i = 1; i<=3 ; i++) {
			String data = databox.getData();//���ο���͸� ����
		}
	}

}
