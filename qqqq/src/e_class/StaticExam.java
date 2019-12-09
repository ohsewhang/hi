package e_class;

public class StaticExam {

	public static void main(String[] args) {
		Account p =new Account(); //객체. 
		p.prn(); //잔액10000언 출력
		p.withdraw(500);//500원지출
		
		Account m = new Account(); //위의 금액이 여기로 연결됌
		m.prn();
		m.withdraw(1000);//1000원 지출
		
		p.prn();//p가 잔액조회
		
		
		Account c1 = new Account();
		c1.prn();
		c1.deposit(5000);
		
		p.prn();
	}
}
