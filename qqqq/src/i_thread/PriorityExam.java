package i_thread;

public class PriorityExam {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=10 ; i++) {
			Thread t =  new CalcThread("thread" + i);//������
			
			if(i!=10) {
				t.setPriority(1);//1 �켱������ ���� ����, 10 �켱������ �������,��� ������� �⺻������5�� �Ҵ����.			
			}else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
				
			t.start();
		}
	}

}
