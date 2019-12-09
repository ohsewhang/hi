package a_begin;

public class Score3 {    //클래스안에는 필드와 메소드만 가능.연산식x,초기값은 가능.
  // int a = 90, b= 80; 클래스안 초기값 가	
	
	public Score3(){     // 생성메소드 ,일반 메소드 이 안에서 (연산 등 가능)
 	 int a = 90 , b = 80; 
     double g = (double)a+b,x = (double)g/2;
	 String c = "오세왕", d ="2019.11.27(수)";

	 
	 		 
	 System.out.println("-------------");
	 System.out.println("성정처리결과");
	 System.out.println("작성일자 :"+d+"크크크");
     System.out.println("작성자 :"+c);
	 System.out.println("국어 :"+a);
	 System.out.println("영어 :"+b);
	 System.out.println("합계 :"+g);
	 System.out.println("평균 :"+x);
	 System.out.println("-------------");
}
  public static void main(String[] args) {
	  
	  new Score3();
 }
}
