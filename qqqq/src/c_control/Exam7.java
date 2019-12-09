package c_control;
import java.util.Scanner;
public class Exam7 {
	Exam7()throws Exception{
		boolean run = true;
		int balance = 0; //잔고를 저장.
									
		Scanner scanner = new Scanner(System.in); //객체생성
	 	
		while(run) { //true일때 반복
			System.out.println("--------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------");
			System.out.printf("버노!> "); //커서 생성.
		  
			//--------------------------------------------------------------
			int a = scanner.nextInt(); //scanner 메소드 호출.
			switch(a){                //switch(a)문으로 조건
				case 1:               //switch(a)실행 . 1입력. case1 실행.
					System.out.println("예금액>");		//예금액 출력
					balance += scanner.nextInt(); //키보드입력 scanner.nextInt();를 입력창에 입력후.임의의 수 1000을 입력.balance에 1000저장. 
					// balance = balance + scanner.nextInt();
					break;
				case 2:
					System.out.println("출금액>"); //while문에서 부터 다시 실행. case 2 의 2를 입력.출금액에 500입력. balance누적된 1000 = -출금액500
					balance -= scanner.nextInt(); // balance누적된 1000 = -출금액500
					if(a>balance) {
						System.out.println("잔액이부족합니다.");
					}
					else if(a<balance) {balance-= a; //if는 지워도댐 / ???????????????????????
					}
					break;
				case 3:
					System.out.print("잔고>");// 누적된 위에서 계산 후 저장된 500.
					System.out.println(balance); //밸런스 값 출력
					break;
				case 4:					
					run = false; // while 문을 false로 바꿔 거짓으로 출력. 종료.
					break;
			}
			
			System.out.println(); 
				
			}//while문 끝.
			System.out.println("종료");
		
		
		
	 		
	}//생성자 끝

	
	
		public static void main(String[] args)throws Exception {
			new Exam7();
			
		}//mian calss끝
}//class 끝.
