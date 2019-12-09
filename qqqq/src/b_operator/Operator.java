/*
 * 작성일자 : 2019.11
 * 작성자 : osw
 * 각종 연산자에 대한 샘플
 */
package b_operator;

public class Operator {
  public Operator() {  //생성자:객체가 생성될때 실행되는 메소드.
	  
	  
	  //나머지 연산자test 홀짝수 나 특정 수의 배수를 확인할 때 사용.	 
	  System.out.println("12%5 ->"+ (12%5));
	  
	  //나머지 연산자와 3항 연산자 test
	  int n = 124;	                              //짝수인지아닌지 (==같다)
	  String r = (n%2==0)? "짝수":"홀수"; 
	  System.out.println( n + "==>" + r);                    
  
	  //증감 연산자
	  //전치 후치
	  int a = 10;
	  int b = 10;
	  a++;          //단항 일 경우 값은 똑같다.
	  ++b;
      System.out.println(a+"," +b); 
      int c = a++; //다항 일 경우 ++은 나중에 계산(전치)
      int d = ++b; //(후치)
      System.out.println(c+","+d);
      System.out.println(a+"," +b);
      // 문자열 
      String name = "오";
      String irum = "오";
      String irum2 = new String("오");  //새로운 메모리에 저장
      System.out.println(name==irum);  //name과irum을 같다고 생각.
      System.out.println(name==irum2); //다르다고 생각.
      System.out.println(name.equals(irum));
      System.out.println(name.equals(irum2));//equals는 문자열로만 생각.
      
      
   
  }
    public static void main(String[] args) {
    new Operator();    //메모리에 올려줌.생성자 명 쓴다.    
  }
}
