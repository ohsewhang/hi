package i_thread;

public class ProducerThread extends Thread {
	private DataBox databox;
	
	public ProducerThread(DataBox databox) {//생성자
		this.databox = databox;  //공유객체를 필드에 저장.
	}
	@Override
	public void run() {
		for(int i = 1 ; i<=3 ; i++) {
			String data = "data-"+i; //?
			databox.setData(data);//새로운 데이터를 저장.
		}
	
	}



}
