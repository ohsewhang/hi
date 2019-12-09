package a_begin;

public class PromotionExample { //실무에서는 클래스에 바로 작성.
 int a = 80;         //필드"클래스가 사용하려는 변수. 맨 상단에 기술.                                       
 int b = 90;         //a,b,c라는 변수는 밑에 main에서 사용할 수 없다.static때문에 
 int c = 50;         //static은 가장 먼저 메모리에 올려준다. 
                     //초기값을 생성자밖에서하면 다른 상황에서도 사용가능.
 //객체를 생성하는 메소드↓,<void Pro~1(){ ->일반 메소드.생성 메소드는 void생략.
 PromotionExample(){//클래스와 같은 명의 생성 메소드,생성자 옆에()필수,-> {~}생성자라고 불리는 메소드 필수,
	 c = a+b;       //클래스 영역안에서는 연산 불가능. 클래스는 필드와 메소드만.
	                // c=a+b는 a,b를 c에 대입해주는 것. (알트+방향키 줄 이동,컨트롤f11런)
  System.out.println(c);
 }
	
 public static void main(String[] args) { 
    new PromotionExample();//new를 써줘야 메모리에 올려준다. (생성자명을 객체로 지정해줘야한다)
 
 
 }
}