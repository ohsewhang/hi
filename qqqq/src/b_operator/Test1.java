/*������ ����� ����
    *�� �� �� ������ ������ ���� ���� ��, ������ ����� ����� ������ ������ ����.
    *������ ���� �� �ϳ���,40�̸��� ������ ���հ� ó��  
    *����� 60�̸��̾ ���հ� ó���� �Ͽ� ������ ���� ��� �հݿ��θ� ����Ͻÿ�
    *��¿���
    *-----------
    *�հݿ�������
    *-----------
    *���� : 50
    *���� : 50
    *���� : 50
    *��� : ���հ�
    *-----------
    */
package b_operator;

public class Test1 {
   int a = 60; //��
   int b = 70; //��
   int c = 60; //��
   int t = 0;  //�հ�
   double d = 0.0;  //���
   boolean r;      //������
   String str;
   
   Test1(){
	   t=a+b+c;
	   d =(double)t/3;
	   
	   r = a<40 || b<40 || c<40 || d<60; //<�ϳ��� �� ������ �� >���հݱ���
	            //���հݱ���  40�̻��϶� ����,40�̸��϶� ��. ����
	 //  r = a>=40 && b>=40  && c >=40 && d>=60; //��.�հ�(����ǥ��) 
	   str = (r)?"��" : "��"; //���϶� ���հ��� ���;���.
	 System.out.println("=======");  
	 System.out.println("�հݿ�������");
	 System.out.println("����:"+a);
	 System.out.println("����:"+b);
	 System.out.println("����:"+c);
	 System.out.println("����:"+t);
	 System.out.println("���:"+d);
	 System.out.println("���:"+str);
   }
  public static void main(String[] args){
	  new Test1();
	  //���Կ�����
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
