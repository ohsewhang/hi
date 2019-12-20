package i_thread;  //WorkObject와함께

public class NotifyExam {

	public static void main(String[] args) {
		WorkObject obj = new WorkObject(); //공유자원 만들어준다
		//t1,t2가 위엤는 워크오브젝트르 쓴다.
		NotifyA t1 = new NotifyA(obj);
		NotifyB t2 = new NotifyB(obj);
		
		t1.start();
		t2.start();
		
	
	}

}
