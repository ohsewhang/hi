package i_thread;

public class YieldB extends Thread {
	boolean stop = false;
	boolean work  = true;
	public void run() {
		while(!stop){//Âü
			if(work) {
				System.out.println("Yield B...");
			}else {
				yield();
			}
			try {
				Thread.sleep(500);			
			}catch(Exception ex) {}
		}
		System.out.println("Yield B Á¾·á");
	}
}
