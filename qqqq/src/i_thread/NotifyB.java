package i_thread;  		//WorkObject�� �Բ�.

public class NotifyB extends Thread {
	WorkObject obj;
	
	NotifyB(WorkObject obj){  //�����ڸ� ���ؼ� �����ڿ� ��ũ������Ʈ�� �ʵ�� �������
		this.obj = obj;
		
		
	}
	
	
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			obj.methodB(); //�޼ҵ� �� ����.
		}
	}

}
