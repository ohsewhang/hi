package i_thread;

public class TreadNameExam {         //ThreadA,Thread�� ����
	

	public static void main(String[] args) {
		Thread mainTread = Thread.currentThread();
		System.out.println(" ���� ������� : "+mainTread.getId());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		
		t1.start();//���
		t2.start();
	}

}
