package a_begin;

public class PromotionExam {
  PromotionExam(){ //������
  byte byteValue = 10;
  int intValue = byteValue;
  System.out.println(intValue);
  
  char charValue = '��';
  intValue = charValue;
  System.out.println("���� �����ڵ�="+intValue);
 
  intValue = 500;
  long longValue = intValue;
  System.out.println(longValue);
  
  intValue =200;
  double doubleValue = intValue;
  System.out.println(doubleValue);
 }
  
  public static void main(String[] args) {
  new PromotionExam(); //������ �޸� ����
	  }
 }
