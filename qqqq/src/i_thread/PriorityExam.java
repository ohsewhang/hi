package i_thread;

public class PriorityExam {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=10 ; i++) {
			Thread t =  new CalcThread("thread" + i);//생성자
			
			if(i!=10) {
				t.setPriority(1);//1 우선순위가 가장 낮음, 10 우선순위가 가장높음,모든 스레드는 기본적으로5로 할당받음.			
			}else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
				
			t.start();
		}
	}

}
