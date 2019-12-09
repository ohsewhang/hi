package c_control;

public class Switch {
  Switch(){
	  int  time =(int)(Math.random()*4)+8;
	  System.out.println("[현재시간 :"+time+"시]");
	switch(time) {
		case 8:
		System.out.println("출근");
		case 9:
		System.out.println("회의");
		case 10:
		System.out.println("업무");
		default: //그 외의 이기에 뒤에 상수를 쓰지않는다.
		System.out.println("외근");
		
	}
  }
}
