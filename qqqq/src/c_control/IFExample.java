package c_control;

public class IFExample {
 int type1(){ //메서드명작성,(좌측)반환형작성,반환형int등..,생략하면 안댕
    int r =0; //생성자는(객체생성),멤버변수(필드)들의 초기화 역할.
    int s =90;//스코어93점.
  if( s>=90 ){
	  //TODO
	 System.out.println("점수가90이상.");
     System.out.println("A");   
  }
  if( s<90 ) { 
	 System.out.println("점수90미만.");
	 System.out.println("B");}
  
    return r;                //return작성,int타입의 값을 작성.(정수형으로 반환된경우)
                             //자바는 항상 4byte(r)
                   //!!!!!!type마다의 같은 변수r은 중괄호가 있어서 사용가능!!!!!!!!!
 }                 //영역이 다르기때문에, 변수는 영역이 같으면 중복x                   
 
  String type2() {   //같은이름x,문자열로 알고 싶다면.
   String r = null;  //r=string형   
	int s = 89;
	if(s>=90) {
		r = "90이상이당";  // 이건 메인으로 하는 것
		r += r+"\nA";		//r=r+"\nA"(엔터) 이건 메인으로 하는 것
	//	System.out.println("90이상이당");  //이건 직접 하는 것
	//	System.out.println("A");      //이건 직접 하는 것
} else {
	   r = "90미만임"; //이거 안뜸!!
	   r = "\nB";
	   //System.out.println("90이하당");
	   //System.out.println("B");
}
   return r;         //문자열로 반환된 경우 
  
  
  
  }
 char type3() {   // 성적을 if~else if를 사용하여 학점을 구하여 r에 저장하시오.
	               //60미만 f.90이상 A,80이상B,70이상C,60D이상D,
	  char r = ' '; //''<-2byte라서 '_'공백문자하나가 필요.
	  int s= 70;
	  if(s>=90)r='a';            //if (s>=90) r='a'
	  else if( s>=80 )r='b';    //else if( s>=80 ) r='b'
	  else if( s>=70 )r='c';    //else if( s>=70 ) r='c'
	  else if( s>=60 )r='d';   //else if( s>=60 ) r='d'
	                       //써도 되고 말고( s<60 )   else
	return r; 
  }
        /*
           *  성적이 0~100점일 때 60이상이면 '합격',60미만이면 '불합격'
           *  출력 하고, 성적이 범위 밖이면 '성적오류'를 출력하시오.  
         */
   void type4(){    //처리된 결과의 반환할게 없다면 void를 써준다.return생략할수있다.
   int score = 100;
   String result = "";
   
   if( score>=0 && score<=100) {                            //중첩 이프문  if문안에 if를 중복사용
   if( score>=60 ){result = "합격";}                          //총3번 사이클함.
   else{result = "불합격";} //else if 는 2번 ,if는 3번.//(score<60)은 지워도 됌
   }            //<-------이프문이 끝나는부분까지만 패스한다.
   else{
	    result = "성적오류";   
   }
   System.out.println(result);
 }
 
 public static void main(String[] args) {
 IFExample obj =new IFExample();// 생성자생성안해서 JVM(가상머신)매개변수가 없는 생성자를 임대해준다.
   obj.type1(); //저 녀석을  익명개체라고 한다. 실행이 안댄당
   //int k = obj.type1();   
   //String m = obj.type2();
  // System.out.println(m);
  
  //System.out.println(obj.type3());  
  char r = obj.type3(); 
  System.out.println(r);
  obj.type4();
  
 
 }                 //obj라는 곳에 생성자를 생성해서 obj에 담아라.obj는 참조형 IFExample형이다.
}                  //obj.type1(); 메소드를 호출. 그럼 출력 /class밖에서만 사용.
                   //int k = obj.type1(); 
                  //String str = new String(); 기존.
                  //str = new Strting();재사용. 기존에 남아있는 스트링은 지워진다.