package e_class;
import java.util.Scanner;
public class Bank1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
					System.out.println("-----------------------------------------");
					System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
					System.out.println("-----------------------------------------");
					System.out.println("����> ");
					
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
				
		}//while�� ��
					System.out.println("���α׷� ����");
					
	}//main ��
	            //���»����ϱ�
		
		private static void createAccount1() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("���»���");
		System.out.println("---------------");
		System.out.println("���¹�ȣ");
		String ano = scanner.nextLine();
		System.out.println("������");
		String owner = scanner.nextLine();
		System.out.println("�ʱ��Աݾ�");
		int balance = scanner.nextInt();
		Account1 newAccount = new Account1(ano, owner, balance);
		for(int i = 0 ; i <accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
				}
		}
		
		
		
		
		
			
			
			
			
		}
		//���¸�Ϻ���
		private static void account1List() {
		//�ۼ���ġ	
		}
		
		//�����ϱ�
		private static void deposit() {
			//�ۼ���ġ
			
		}
		//����ϱ�
		private static void withdraw() {
			//�ۼ���ġ
		}
		//Account �迭���� ano�� ������ Account ��ü ã��
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