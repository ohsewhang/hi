package i_thread;

public class User1 extends Thread {
	Calc calc; //�����ڿ� 
	
	
	public void setCalc(Calc calc) { //calc��� �޼ҵ帣 �����ؼ� �ܺο��� calc�� �޾ƿ���
		this.calc = calc;
		this.setName("User 1");
	}


	@Override
	public void run() {
		calc.setMemory(100); //100�̶� ���� �޸𸮿� ������.
	}

}
