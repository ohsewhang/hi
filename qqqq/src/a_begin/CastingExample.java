package a_begin;

public class CastingExample {
	  
   public CastingExample(){//������ ����.public�Ű��������� �����ڴ� ��Ű�� ������� �ƹ��� ��ü�� �����Ҽ��ִ�
       //int ->char
	   int a = 44034;
       char c = (char)a;  //ū int�� ���� char�� �ٲٱ� ���ؼ� (ĳ�����ؾߵɵ�������)	
 	   System.out.println(a + " to char type : " + c);

     //long->int
 	   long l = 500l;  //(��Ģ ���� �ڿ� l�� ������Ѵ�.)
 	   int b = (int)l; //ū long���� int �� �Ұ�ȣ 
 	   System.out.println(l);
 	      
 	 //doudble->int
 	   double d = 3.14;
 	   int e =(int) d;
       System.out.println(d + "to int type : "+ e);
     //double->
       double d2 = 10/3;//������ ������ ������ ���´�.����Ÿ���̶� 3.0�� ���� ��.
       System.out.println(d2);  //3�տ� (����)�� �ϸ� ���� �� �Ǽ��� �Ǽ��� ���´�.
 }	      
   public static void main(String[] args) { //���ο����� ������ �޸𸮿� �ø���.
   new CastingExample();
  }
}
