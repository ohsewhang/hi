/*
 * 경계값 test
 */
package b_operator;

public class Operator2 {
   public Operator2(){
   int kor = 50, eng = 50;
    //국어 성적이 60이상, 영어 성적도 60이상일 때 "합격" 
   boolean b = (kor>=60)&(eng>=60);     
   System.out.println(b);
    //국어 성적 60이상 이거나 영어 성적 60이상일 때 "합격"
   int kor1 =50, eng1 =30;
   b = (kor1>=50)|(eng1>=60);
      System.out.println(b);
   }
   
   
  public static void main(String[] args) {
	  new Operator2();  

 }


}