package c_control;

public class SwitchExample {
	
  public SwitchExample() {
	  String a ="";          //출력을 한번에 하는 법. 
	  int num = 0;
	  
	  for(int i=0 ; i<5 ;i=i+1 ) {  //반복문 조건;500번;증감
	  num = (int)(Math.random()*6) +1;//int num = (int)(Math.random()*6) +1;의 int는 생성자밑에 두면 좋다. 
	  if(num<1 || num>6) { 
	    System.out.println("번호오류발생");  //랜덤뒤에 숫자를 바꾸면 볼 수 있다.
	    System.exit(0); //시스템 종료.
	  }
	 
	  switch(num) {
	  case 1 :
	a= ("1 입니다.");	//  System.out.println("1 입니다.");
		  break;
	  case 2 :
	a= ("2 입니다.");	 // System.out.println("2 입니다.");
		  break;
	  case 3 :
	a = ("3 입니다.");	 // System.out.println("3 입니다.");
          break;
	  case 4 :
	a = ("4 입니다.");	 // System.out.println("4 입니다.");
		  break;
	  case 5 :
	a = ("5 입니다.");	 // System.out.println("5 입니다.");
		  break;
	  default :
	a = ("6 입니다.");	//System.out.println("6 입니다.");
		  break;                //main클래스에서 실행.
		  } //스위치 끝.
	 System.out.println(a);
	}//포문 끝
	
	 
  	}//생성자 끝.
}