package a_begin;

public class Score3 {    //Ŭ�����ȿ��� �ʵ�� �޼ҵ常 ����.�����x,�ʱⰪ�� ����.
  // int a = 90, b= 80; Ŭ������ �ʱⰪ ��	
	
	public Score3(){     // �����޼ҵ� ,�Ϲ� �޼ҵ� �� �ȿ��� (���� �� ����)
 	 int a = 90 , b = 80; 
     double g = (double)a+b,x = (double)g/2;
	 String c = "������", d ="2019.11.27(��)";

	 
	 		 
	 System.out.println("-------------");
	 System.out.println("����ó�����");
	 System.out.println("�ۼ����� :"+d+"ũũũ");
     System.out.println("�ۼ��� :"+c);
	 System.out.println("���� :"+a);
	 System.out.println("���� :"+b);
	 System.out.println("�հ� :"+g);
	 System.out.println("��� :"+x);
	 System.out.println("-------------");
}
  public static void main(String[] args) {
	  
	  new Score3();
 }
}
