/*
 * ��谪 test
 */
package b_operator;

public class Operator2 {
   public Operator2(){
   int kor = 50, eng = 50;
    //���� ������ 60�̻�, ���� ������ 60�̻��� �� "�հ�" 
   boolean b = (kor>=60)&(eng>=60);     
   System.out.println(b);
    //���� ���� 60�̻� �̰ų� ���� ���� 60�̻��� �� "�հ�"
   int kor1 =50, eng1 =30;
   b = (kor1>=50)|(eng1>=60);
      System.out.println(b);
   }
   
   
  public static void main(String[] args) {
	  new Operator2();  

 }


}