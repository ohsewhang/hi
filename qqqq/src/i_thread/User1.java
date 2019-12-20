package i_thread;

public class User1 extends Thread {
	Calc calc; //공유자원 
	
	
	public void setCalc(Calc calc) { //calc라는 메소드르 ㄹ통해서 외부에서 calc를 받아오다
		this.calc = calc;
		this.setName("User 1");
	}


	@Override
	public void run() {
		calc.setMemory(100); //100이란 값을 메모리에 저장함.
	}

}
