package i_thread;

public class YieldExam {

	public static void main(String[] args) {
		YieldA y1 = new YieldA();
		YieldB y2 = new YieldB();
		
		y1.start(); //콘솔에 실행시키는 문장
		y2.start();				//둘다실행시켜서 abababababab
		
		try {
			Thread.sleep(3000);			//y1을 펄스로 바꿔주니까 참이 아니라서 b에 양보
		}catch(Exception ex) {}
		
		y1.work =false;
		
		
		try {
			Thread.sleep(3000);			//y1을 참으로 바꿔주니까 참이라서 같이나옴.
		}catch(Exception ex) {}
		
		y1.work = true;			
		
		try {
			Thread.sleep(500);			
		}catch(Exception ex) {}		//y1과y2가 순서대로 트루가 돼서 종료
		
		y1.stop = true;
		y2.stop = true;
	}

}
