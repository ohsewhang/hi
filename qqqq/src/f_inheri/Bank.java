package f_inheri;

public class Bank {
	static Account[] ac; //어카운트타입 고유자원static
	static int count; //계좌 수
	
	static{//1회 초기화
		ac = new Account[100];//100명의 계좌  //고유자원이라 초기화는 한번만된다;
		Account a = new Account("hong","111-111",5000);
		ac[0] = a;
		
		a = new Account("kim","222-222",10000);
		ac[1]  = a;
		
		a = new Account("park","333-333",50000);
		ac[2] = a;
				
		
		
		count = 3; 
		
		
	}
}
