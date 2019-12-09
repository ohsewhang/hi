package a_begin;

public class CastingExample {
	  
   public CastingExample(){//생성자 생성.public매개변수없는 생성자는 패키지 상관없이 아무누 객체를 생성할수있다
       //int ->char
	   int a = 44034;
       char c = (char)a;  //큰 int를 작은 char로 바꾸기 위해서 (캐스팅해야될데이터형)	
 	   System.out.println(a + " to char type : " + c);

     //long->int
 	   long l = 500l;  //(원칙 롱은 뒤에 l을 써줘야한다.)
 	   int b = (int)l; //큰 long에서 int 로 소괄호 
 	   System.out.println(l);
 	      
 	 //doudble->int
 	   double d = 3.14;
 	   int e =(int) d;
       System.out.println(d + "to int type : "+ e);
     //double->
       double d2 = 10/3;//정수와 정수는 정수로 나온다.더블타입이라 3.0이 나온 것.
       System.out.println(d2);  //3앞에 (더블)을 하면 정수 대 실수로 실수가 나온다.
 }	      
   public static void main(String[] args) { //메인에서는 생성자 메모리에 올린다.
   new CastingExample();
  }
}
