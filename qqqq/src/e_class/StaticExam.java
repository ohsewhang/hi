package e_class;

public class StaticExam {

	public static void main(String[] args) {
		Account p =new Account(); //��ü. 
		p.prn(); //�ܾ�10000�� ���
		p.withdraw(500);//500������
		
		Account m = new Account(); //���� �ݾ��� ����� �����
		m.prn();
		m.withdraw(1000);//1000�� ����
		
		p.prn();//p�� �ܾ���ȸ
		
		
		Account c1 = new Account();
		c1.prn();
		c1.deposit(5000);
		
		p.prn();
	}
}
