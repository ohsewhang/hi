package i_thread;

public class DataBox { //������ü
	private String data;
			//��ȣ��Ÿ������ȭ�� �ִ� 
	public synchronized  String getData() {//��
		if(this.data ==null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}//if
		String returnValue =data; //������ ���� ���Ϻ����� �־���.
		System.out.println("ConsumerThread�� ���� ������ :"+returnValue); //�����Ͱ� ���� �ƴϸ� �̰� ���.
		data = null;
		notify();//�Ͻ��������·� ���.
		return returnValue;
	}
	public synchronized void setData(String data) {//��
		if(this.data != null) {
			try {
				wait();				
			}catch(InterruptedException e) {};
		}//if
		this.data = data;
		System.out.println("ConsumerThread�� ������ ������:"+data );
		notify();  //�Ͻ��������·� ���.
	}
	

}
