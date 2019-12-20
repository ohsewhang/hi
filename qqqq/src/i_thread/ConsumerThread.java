package i_thread;

public class ConsumerThread extends Thread {
	private DataBox databox;
	
	public ConsumerThread(DataBox databox) {
		this.databox= databox;  //공유객체를 필드에 저장.
	}
	
	public void run() {
		for(int i = 1; i<=3 ; i++) {
			String data = databox.getData();//새로운데이터를 읽음
		}
	}

}
