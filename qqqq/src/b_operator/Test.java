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

public class Test {
 Test(){
   int kor=50, eng=50, ma=50;
   int tot= kor+eng+ma;
   double ava= (double) tot/3;
   boolean a = (kor>=40)&(eng>40)&(ma>40) & (tot>=60); //조건1과 조건2 동시충족 
   //boolean a = (kor<40)|(eng<40)|(ma<40) 40미만이면 불합 ,or
   String str=null;

   System.out.println("합격 여부 통지");
   System.out.println("------------");
   System.out.println("국어:"+kor); 
   System.out.println("영어:"+eng);
   System.out.println("수학:"+ma);
   System.out.println("총점:"+tot);
   System.out.println("평균:"+ava);
   str = (a)?"합격":"불합격" ;//()안은 논리식.
   System.out.println( str + "==>" + a); 
   System.out.println("------------");
   
   
 }


 public static void main(String[] args) {
  new Test();
 }

}
