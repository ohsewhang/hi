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

public class Test {
 Test(){
   int kor=50, eng=50, ma=50;
   int tot= kor+eng+ma;
   double ava= (double) tot/3;
   boolean a = (kor>=40)&(eng>40)&(ma>40) & (tot>=60); //����1�� ����2 �������� 
   //boolean a = (kor<40)|(eng<40)|(ma<40) 40�̸��̸� ���� ,or
   String str=null;

   System.out.println("�հ� ���� ����");
   System.out.println("------------");
   System.out.println("����:"+kor); 
   System.out.println("����:"+eng);
   System.out.println("����:"+ma);
   System.out.println("����:"+tot);
   System.out.println("���:"+ava);
   str = (a)?"�հ�":"���հ�" ;//()���� ����.
   System.out.println( str + "==>" + a); 
   System.out.println("------------");
   
   
 }


 public static void main(String[] args) {
  new Test();
 }

}
