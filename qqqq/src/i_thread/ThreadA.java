package i_thread;

public class ThreadA extends Thread{
	
	ThreadA(){             //�����Ѵ�.
	this.setName("ThreadA...."); //�̰� ����.
	}				
	
	@Override
	public void run() {      //���� ���������ش�
		for(int i = 0 ; i<500 ; i++) {
			System.out.println(this.getName());//�³����� �����´�.
		
	}





}
/*
 * 1. Thread �� ����ϴ� ���
 *   Class MyThread extends Thread{
 *   public void run(){   //��Ƽ�۾�} // ���ο����� �۾��Ҽ��ִ�. �ٸ� �޼ҵ忡�� ������ ������ ��Ƽ������δ� �ƴϴ�
 *   	}
 *   }
 *   
 *  2. Runnable �� �����ϴ¹��
 *     class MyThread implements Runnable{
 *     		public void run(){//��Ƽ�۾�} 
 *  3.������
 *  
 *   Thread�� ��ӹ��� ���
 *    Thread t = new MyThread(); //MyThread = new MyThread();
 *    t.start(); //��Ƽ�۾��� ȯ���� ������ �Ǹ� �ڵ����� run()�޼ҵ尡 ȣ��ȴ�.
 *    
 *    Runnable�� ������ ��� 
 *   
 *   Runnable r = bew MyThread(); ����ȭ��Ŵ.<-�Ѵ� ��������-> //MyThread = new MyThread();    
 *    Thread t = new Thread(r) �̷������� ���ľ� ��.
 *     t.strat(); 
 */
}




