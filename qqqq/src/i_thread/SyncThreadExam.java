package i_thread;

public class SyncThreadExam {

	public static void main(String[] args) {
		Calc calc = new Calc();  //�����ڿ� �ϳ��� ��ü.�̰� �ؿ� setcalc�� u1��u2�� �ش�
 		
		User1 u1 = new User1();
		User2 u2 = new User2();
		
		u1.setCalc(calc);
		u2.setCalc(calc); //�������� �����ڿ� calc�� ��
	
		u1.start();
		u2.start();
		
	}
}
