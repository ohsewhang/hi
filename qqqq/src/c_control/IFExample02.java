/*
package c_control;

class IFExample02 {               //[]�� �迭
       //�Լ� ���� ����->(��,����,�ݺ���(�޼ҵ�) �׼��� �޼ҵ�ȿ��� ����������
  public static void main(String[] a) { //mian=�Լ� �Ұ�ȣ�� �ֱ⶧���� �Լ�or�޼ҵ�)
//jvm�� �Ű������� ���� ������ �Ӵ�! String�� ���ڿ�.�տ� �빮�ڴ� class->new�����ڷ� �����Ҽ� �ִ�
 //int k = . IFExample o = 0; o�� ã�ư��� �����̱������� ã�ư��µ� �����̱������� 0�� �ƴϱ⿡.
 //int k = 3.14; �Ǽ��� ������ ���� ���ϵ�.   
  IFExample02  obj = new IFExample02();//obj�� class ifexample���� �����͸� �������ִ�.
 //Ŭ������ ������Ʈ�� new������ �޸𸮿� class�� �ø��� 
  int k = obj.type1(); //obj�� ������ �ִ� type1(�޼ҵ�)�� �����ض�.�� ����� int=k�� �����ض�. type1�̶� �ִ� �ϴ��� ���� �������ϰ��̴�.               
                       // type1�� r���� ���� , ���Ϻ������ ���Ϲ޴� ���� ���� �ϴ°�찡 ���� .����� 0�� ���´�. �����ϴ� ��������
  System.out.println(k);
  System.out.println(obj.type1()); //��ȯ�� ������ ��ȯ���� �����������.������ �ȴ�.��� 0�� ��µȴ�.
  String m = obj.type2(); //obj�� ������ �ִ� type2�� �����´�.���ڿ��� ���ϵȴ�.(�ּҰ����°�null)�̶� ���� ������ �� �ִ�.
  System.out.println(m); System.out.println(obj.type3());
  
  char c = obj.type3();
  System.out.println(c);
  }  
// return "abc";
// return "abc"; ������ �������� �ѹ��� ����!! �߰� �߰� �ִ� ������ �ϼ��� ���� �ƴ�. 
	
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