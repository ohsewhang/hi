package i_thread;//SyncThreadExam이랑.

public class Calc {
	private int memory; //필드

	public int getMemory() {    //게터세터 생성.
		return memory;
	}
//상호배타적 동기화를 구현synchronized를 써주면 자기값은 100으로 나옴 안써주면 50,50임
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);    //2초간 대기하고 실행시키는 기능.
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() +" :"+ this.memory);
	
	
	
	
	}
		
}
