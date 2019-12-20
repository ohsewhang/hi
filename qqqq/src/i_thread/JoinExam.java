package i_thread;

public class JoinExam {

	public static void main(String[] args) {


		SumThread st =  new SumThread();
		st.start();
		
		try {
			st.join(); //스레드값이 많을때 스레드값을 반드시 받아야된다면 조인을 써준다.안그러면 0.
		}catch(InterruptedException e) {}
		
		System.out.println("1~100의 합계 : " + st.sum);
	}

}


