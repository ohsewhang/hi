/*논리식을 사용한 응용
    *국 영 수 점수를 정수로 변수 저장 후, 총점과 평균을 계산해 적당한 변수에 저장.
    *세개의 점수 중 하나라도,40미만이 있으면 불합격 처리  
    *평균이 60미만이어도 불합격 처리를 하여 점수와 총점 평균 합격여부를 출력하시오
    *출력예시
    *-----------
    *합격여부통지
    *-----------
    *국어 : 50
    *영어 : 50
    *수학 : 50
    *결과 : 불합격
    *-----------
    */
package b_operator;

public class Test1 {
   int a = 60; //국
   int b = 70; //영
   int c = 60; //수
   int t = 0;  //합계
   double d = 0.0;  //평균
   boolean r;      //참거짓
   String str;
   
   Test1(){
	   t=a+b+c;
	   d =(double)t/3;
	   
	   r = a<40 || b<40 || c<40 || d<60; //<하나라도 참 나오면 불 >불합격기준
	            //불합격기준  40이상일때 거짓,40미만일때 참. 논리합
	 //  r = a>=40 && b>=40  && c >=40 && d>=60; //참.합격(긍정표현) 
	   str = (r)?"블" : "합"; //참일때 불합격이 나와야함.
	 System.out.println("=======");  
	 System.out.println("합격여부통지");
	 System.out.println("국어:"+a);
	 System.out.println("영어:"+b);
	 System.out.println("수학:"+c);
	 System.out.println("총점:"+t);
	 System.out.println("평균:"+d);
	 System.out.println("결과:"+str);
   }
  public static void main(String[] args){
	  new Test1();
	  //대입연산자
  /* int a=10;
   int b=20;
   int c=0;
   c += a;//c = c+a;
   c -= a;//c = c-a;
   c %= 2;//c= c%2;
   a++;//a=a+1;
*/   
   
  }
  
}
