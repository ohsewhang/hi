package f_inheri;

public class Bank {
	static Account[] ac; //��ī��ƮŸ�� �����ڿ�static
	static int count; //���� ��
	
	static{//1ȸ �ʱ�ȭ
		ac = new Account[100];//100���� ����  //�����ڿ��̶� �ʱ�ȭ�� �ѹ����ȴ�;
		Account a = new Account("hong","111-111",5000);
		ac[0] = a;
		
		a = new Account("kim","222-222",10000);
		ac[1]  = a;
		
		a = new Account("park","333-333",50000);
		ac[2] = a;
				
		
		
		count = 3; 
		
		
	}
}
