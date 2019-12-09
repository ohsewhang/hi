package c_control;

public class WhileExam2 {
	WhileExam2()throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 8;
	
		while(run) {
			if(keyCode !=13 && keyCode !=10) {
				System.out.println("----");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----");
				System.out.println("선택:");
			}//if문 끝
		
		keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도="+speed); 
			}
				else if(keyCode == 50) {
				speed--;
				System.out.println("현재속도="+speed);	
			}	else if(keyCode == 51) {
				run = false;
			}
			
		
		}//while문 끝
				System.out.println("프로그램 종료");
	}
}
