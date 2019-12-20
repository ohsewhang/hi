package i_thread;

public class SyncThreadExam {

	public static void main(String[] args) {
		Calc calc = new Calc();  //공유자원 하나의 객체.이게 밑에 setcalc에 u1과u2에 준다
 		
		User1 u1 = new User1();
		User2 u2 = new User2();
		
		u1.setCalc(calc);
		u2.setCalc(calc); //유저에게 공유자원 calc를 줌
	
		u1.start();
		u2.start();
		
	}
}
