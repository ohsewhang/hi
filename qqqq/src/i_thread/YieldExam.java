package i_thread;

public class YieldExam {

	public static void main(String[] args) {
		YieldA y1 = new YieldA();
		YieldB y2 = new YieldB();
		
		y1.start(); //�ֿܼ� �����Ű�� ����
		y2.start();				//�Ѵٽ�����Ѽ� abababababab
		
		try {
			Thread.sleep(3000);			//y1�� �޽��� �ٲ��ִϱ� ���� �ƴ϶� b�� �纸
		}catch(Exception ex) {}
		
		y1.work =false;
		
		
		try {
			Thread.sleep(3000);			//y1�� ������ �ٲ��ִϱ� ���̶� ���̳���.
		}catch(Exception ex) {}
		
		y1.work = true;			
		
		try {
			Thread.sleep(500);			
		}catch(Exception ex) {}		//y1��y2�� ������� Ʈ�簡 �ż� ����
		
		y1.stop = true;
		y2.stop = true;
	}

}
