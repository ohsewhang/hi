package i_thread;

public class JoinExam {

	public static void main(String[] args) {


		SumThread st =  new SumThread();
		st.start();
		
		try {
			st.join(); //�����尪�� ������ �����尪�� �ݵ�� �޾ƾߵȴٸ� ������ ���ش�.�ȱ׷��� 0.
		}catch(InterruptedException e) {}
		
		System.out.println("1~100�� �հ� : " + st.sum);
	}

}


