package i_thread;

public class YieldA extends Thread{
	
	boolean stop = false;
	boolean work = true;
	
	@Override
	public void run() { //run�� �־�� ����.
		while(!stop){ //��
			if(work) {
			System.out.println("YieldA...");
			}else {
				yield();
			}
			try {
				Thread.sleep(500);			
			}catch(Exception ex) {}
		}
		System.out.println("Yield A����");
	}

}
