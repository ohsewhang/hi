package i_thread;

public class ProducerThread extends Thread {
	private DataBox databox;
	
	public ProducerThread(DataBox databox) {//������
		this.databox = databox;  //������ü�� �ʵ忡 ����.
	}
	@Override
	public void run() {
		for(int i = 1 ; i<=3 ; i++) {
			String data = "data-"+i; //?
			databox.setData(data);//���ο� �����͸� ����.
		}
	
	}



}
