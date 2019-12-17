package e_class;
import java.util.Scanner;
public class Bank1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
					System.out.println("-----------------------------------------");
					System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
					System.out.println("-----------------------------------------");
					System.out.println("선택> ");
					
					int selectNo = scanner.nextInt();					
					if(selectNo == 1) {
						createAccount1();
					}else if (selectNo ==2) {
						account1List();
					}else if(selectNo ==3) {
						deposit();
					}else if(selectNo ==4) {
						withdraw();
					}else if(selectNo ==5) {
						run = false;
					} 
				
		}//while문 끝
					System.out.println("프로그램 종료");
					
	}//main 끝
	            //계좌생성하기
		
		private static void createAccount1() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		System.out.println("계좌번호");
		String ano = scanner.nextLine();
		System.out.println("계좌주");
		String owner = scanner.nextLine();
		System.out.println("초기입금액");
		int balance = scanner.nextInt();
		Account1 newAccount = new Account1(ano, owner, balance);
		for(int i = 0 ; i <accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
				}
		}
		
		
		
		
		
			
			
			
			
		}
		//계좌목록보기
		private static void account1List() {
		//작성위치	
		}
		
		//예금하기
		private static void deposit() {
			//작성위치
			
		}
		//출금하기
		private static void withdraw() {
			//작성위치
		}
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account1 findAccount(String ano) {
		       Account1 account = null;
		       for(int i = 0; i<accountArray.length; i++) {
		          if(accountArray[i] != null) {
		             String str = accountArray[i].getAno();
		           if(str.equals(ano)) {
		             account = accountArray[i];
		             break;
		          } 
		         }
		       }       
		       return account;
		    }
}