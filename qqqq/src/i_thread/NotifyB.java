package i_thread;  		//WorkObject와 함께.

public class NotifyB extends Thread {
	WorkObject obj;
	
	NotifyB(WorkObject obj){  //생성자를 통해서 공유자원 워크오브젝트를 필드로 집어넣음
		this.obj = obj;
		
		
	}
	
	
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			obj.methodB(); //메소드 비 실행.
		}
	}

}
