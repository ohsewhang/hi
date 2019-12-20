package i_thread;           //WorkObject와함께


public class NotifyA extends Thread {
	WorkObject obj; 
	
	NotifyA(WorkObject obj){//생성자
		this.obj = obj;
	}
	
	public void run() {
		for(int i= 0 ; i<10 ; i++) {
			obj.methodA(); //a열번출력
		}
	}
}
