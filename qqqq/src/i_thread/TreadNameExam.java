package i_thread;

public class TreadNameExam {         //ThreadA,Thread의 메인
	

	public static void main(String[] args) {
		Thread mainTread = Thread.currentThread();
		System.out.println(" 메인 스레드명 : "+mainTread.getId());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		
		t1.start();//출력
		t2.start();
	}

}
