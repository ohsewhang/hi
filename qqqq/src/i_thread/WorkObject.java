package i_thread;       //NotifyA �� �Բ� 

public class WorkObject {               //�����ڿ�
	public synchronized void methodA() {  //synchronized�� ����ȭ abababab�����ư��� ��������ش�.
	System.out.println("ThreadA �� methodA().......");
		notify(); //���������Ǿ� �ִ� �����带 ����
		
	try {	
		wait();  //�ڱ��ڽ��� ��ٸ����Ѵ�.
	}catch(InterruptedException e) {}
	
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB �� methodB().......");
		notify();
		
		
		try {	
			wait();	  //�ڱ��ڽ��� ��ٸ����Ѵ�.
		}catch(InterruptedException e) {}
		
		
	}
	
}
