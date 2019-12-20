package i_thread;       //NotifyA 와 함께 

public class WorkObject {               //공유자원
	public synchronized void methodA() {  //synchronized는 동기화 abababab번갈아가며 실행시켜준다.
	System.out.println("ThreadA 의 methodA().......");
		notify(); //실행중지되어 있는 쓰레드를 깨움
		
	try {	
		wait();  //자기자신을 기다리게한다.
	}catch(InterruptedException e) {}
	
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB 의 methodB().......");
		notify();
		
		
		try {	
			wait();	  //자기자신을 기다리게한다.
		}catch(InterruptedException e) {}
		
		
	}
	
}
