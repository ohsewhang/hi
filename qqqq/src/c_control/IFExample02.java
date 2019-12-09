/*
package c_control;

class IFExample02 {               //[]는 배열
       //함수 선언 이유->(비교,연산,반복의(메소드) 액션이 메소드안에서 행해져야함
  public static void main(String[] a) { //mian=함수 소괄호가 있기때문에 함수or메소드)
//jvm이 매개변수가 없는 생성자 임대! String은 문자열.앞에 대문자는 class->new연산자로 생성할수 있다
 //int k = . IFExample o = 0; o를 찾아가면 이프이그잼플을 찾아가는데 이프이그잼플은 0이 아니기에.
 //int k = 3.14; 실수를 정수에 대입 못하듯.   
  IFExample02  obj = new IFExample02();//obj는 class ifexample형의 데이터를 얻을수있다.
 //클래스명 오브젝트명 new연산자 메모리에 class를 올린다 
  int k = obj.type1(); //obj가 가지고 있는 type1(메소드)를 실행해라.그 결과를 int=k에 저장해라. type1이란 애는 하단의 리턴 정수형일것이다.               
                       // type1의 r값이 적용 , 리턴변수명과 리턴받는 명을 같게 하는경우가 많다 .결과는 0이 나온다. 저장하는 행위까지
  System.out.println(k);
  System.out.println(obj.type1()); //반환은 하지만 반환값을 사용하지않음.실행은 된다.결과 0은 출력된다.
  String m = obj.type2(); //obj가 가지고 있는 type2를 가져온다.문자열로 리턴된다.(주소가없는값null)이란 값을 리턴할 수 있다.
  System.out.println(m); System.out.println(obj.type3());
  
  char c = obj.type3();
  System.out.println(c);
  }  
// return "abc";
// return "abc"; 리턴은 마지막에 한번만 가능!! 중간 중간 있는 리턴은 완성된 것이 아님. 
	
  int type1() {
	  int r = 0;
	  int s =53;
	  
  }
  
  String type2() {
	  String r = 
  }
  char type3() {
	  char r =' ';
	  int s = 77;
	  if (s >=90) {return'a';}    //{s ='a'}//
	  else if(s >= 80){return'b';}   //{ s ='b';}
	  else if(s >= 70){return'c';}   //{ s ='c';}
	  else if(s >= 60){return'd';}   //{ s ='d';}
	 else {return'f';)
  }
*/