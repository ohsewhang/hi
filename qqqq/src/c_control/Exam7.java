package c_control;
import java.util.Scanner;
public class Exam7 {
	Exam7()throws Exception{
		boolean run = true;
		int balance = 0; //�ܰ� ����.
									
		Scanner scanner = new Scanner(System.in); //��ü����
	 	
		while(run) { //true�϶� �ݺ�
			System.out.println("--------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("--------");
			System.out.printf("����!> "); //Ŀ�� ����.
		  
			//--------------------------------------------------------------
			int a = scanner.nextInt(); //scanner �޼ҵ� ȣ��.
			switch(a){                //switch(a)������ ����
				case 1:               //switch(a)���� . 1�Է�. case1 ����.
					System.out.println("���ݾ�>");		//���ݾ� ���
					balance += scanner.nextInt(); //Ű�����Է� scanner.nextInt();�� �Է�â�� �Է���.������ �� 1000�� �Է�.balance�� 1000����. 
					// balance = balance + scanner.nextInt();
					break;
				case 2:
					System.out.println("��ݾ�>"); //while������ ���� �ٽ� ����. case 2 �� 2�� �Է�.��ݾ׿� 500�Է�. balance������ 1000 = -��ݾ�500
					balance -= scanner.nextInt(); // balance������ 1000 = -��ݾ�500
					if(a>balance) {
						System.out.println("�ܾ��̺����մϴ�.");
					}
					else if(a<balance) {balance-= a; //if�� �������� / ???????????????????????
					}
					break;
				case 3:
					System.out.print("�ܰ�>");// ������ ������ ��� �� ����� 500.
					System.out.println(balance); //�뷱�� �� ���
					break;
				case 4:					
					run = false; // while ���� false�� �ٲ� �������� ���. ����.
					break;
			}
			
			System.out.println(); 
				
			}//while�� ��.
			System.out.println("����");
		
		
		
	 		
	}//������ ��

	
	
		public static void main(String[] args)throws Exception {
			new Exam7();
			
		}//mian calss��
}//class ��.
