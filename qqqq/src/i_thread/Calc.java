package i_thread;//SyncThreadExam�̶�.

public class Calc {
	private int memory; //�ʵ�

	public int getMemory() {    //���ͼ��� ����.
		return memory;
	}
//��ȣ��Ÿ�� ����ȭ�� ����synchronized�� ���ָ� �ڱⰪ�� 100���� ���� �Ƚ��ָ� 50,50��
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);    //2�ʰ� ����ϰ� �����Ű�� ���.
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() +" :"+ this.memory);
	
	
	
	
	}
		
}
