package e_class;

public class Account { //°èÁ¤
	void deposit(int amt) {
		Bank.amount += amt;
		prn();
		
	}
	void withdraw(int amt) {
		Bank.amount -= amt;
		prn();
	}
	void prn() {
		System.out.println("ÀÜ¾× :"+ Bank.amount);
	}
}
