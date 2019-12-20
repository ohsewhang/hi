package i_thread;

public class YieldA extends Thread{
	
	boolean stop = false;
	boolean work = true;
	
	@Override
	public void run() { //run이 있어야 실행.
		while(!stop){ //참
			if(work) {
			System.out.println("YieldA...");
			}else {
				yield();
			}
			try {
				Thread.sleep(500);			
			}catch(Exception ex) {}
		}
		System.out.println("Yield A종료");
	}

}
