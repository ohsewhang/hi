package i_thread;

public class ThreadA extends Thread{
	
	ThreadA(){             //생성한다.
	this.setName("ThreadA...."); //이걸 설정.
	}				
	
	@Override
	public void run() {      //런을 재정의해준다
		for(int i = 0 ; i<500 ; i++) {
			System.out.println(this.getName());//셋네임을 가져온다.
		
	}





}
/*
 * 1. Thread 를 사용하는 방법
 *   Class MyThread extends Thread{
 *   public void run(){   //멀티작업} // 메인에서만 작업할수있다. 다른 메소드에서 실행은 되지만 멀티쓰레드로는 아니다
 *   	}
 *   }
 *   
 *  2. Runnable 을 구현하는방법
 *     class MyThread implements Runnable{
 *     		public void run(){//멀티작업} 
 *  3.실행방법
 *  
 *   Thread를 상속받은 경우
 *    Thread t = new MyThread(); //MyThread = new MyThread();
 *    t.start(); //멀티작업에 환경이 구축이 되면 자동으로 run()메소드가 호출된다.
 *    
 *    Runnable을 구현한 경우 
 *   
 *   Runnable r = bew MyThread(); 다형화시킴.<-둘다 같은거임-> //MyThread = new MyThread();    
 *    Thread t = new Thread(r) 이런과정을 거쳐야 함.
 *     t.strat(); 
 */
}




