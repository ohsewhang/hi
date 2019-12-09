package c_control;

public class Lotto {
 private int n[] = new int[6];//필드(변수) 선언.필드형은 자동 초기화.private접근제한!![]배열을만든다.new로 만드는 순간 참조형.
 int count = 0;//count를 클래스로 올린다 //변수n은 pro,prn에서도 사용가능. 그래서 반환값 x
 void process() {          //process메소드-1.소괄호 2.반환형이 반드시 있어야함 없을 시 void.
  boolean b = false;//중복되지 않았다라는 개념.
  this.n[count] = (int)(Math.random()*45)+1;//random은 void static random이라 static을 생성할 필요가 없음.
  for(int i=0; i<count ; i++) {
	if(n[i]==n[count]){                      //먼저staticvoidmain찾기
     b = true;                              //생성자찾기.없으면 main가상머신	                             
	}                                       //
  }
  
  if( !b ) {              //중복되지않았을때 카운트가 증가.
	  count++; 
	  this.prn();
	  
  }
 }   //this 멤버 함수를 지칭할때는 this를 쓴다. //[count]변수선언.
  
 void prn() {  // 출력
	 System.out.println(n[count-1] );     //n,pro,prn 인썬스형 ->객체를 만들어야한다.
 }                          //count-1안하면 process가먼저출력되기에 5번카운트할떄6으로 초과됌 그래서-1)
          //
 public static void main(String[] args) {
 Lotto k = new Lotto(); //객체생성.객체의 주소를 알기위한 변수k를 좌변에.k=lotto형임.
   int a = 6; //기준.a=6개중복되지않는개수의 기준.
 //  for(a=0;a<6;a++) {//for문(;;)반복횟수 지정.(제어변수)여긴 첫번째영역이기에for문안에서만 사용가능
   for(;k.count<a;) { //count는 5까지하면 6까지 찬다.위에 count++이 증감을 줬기에 앞뒤에 안써도 된다. 
   k.process(); //k는 static형내에서 형성돼서 static형.
	                       //;가운데영역은 실행조건;true를 넣으면 무한반복.제어변수의 증감을 써준다
    //mian에 동기화 시켜준다. a(0~6)랑 같이 실행되게 하기위해   
   }                      //a==0을 가운데에 넣으면 0,1무한반복 같다,다르다 식으로 a<6이면 6번반복
    /* k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
    */
 }
}
