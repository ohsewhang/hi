package b_operator;

public class Operator5 {
  
	int value = 356;
	
	 
	 Operator5(){
	 
     System.out.println(value/100*100);  //10�� �ڸ����� ������.
	  
     //(��)���ݰ��,12,340 ->12,300 10������ ����(12340/100 ->123*100=12300)
     //10������� 100���� ���� �� 100���� ����
     //�� �����̸� 10���� ���� �� 10���� ����
     int a=12340;
     int q=a/100*100; 
     System.out.println(q);	
	 //(��)���ڰ��,12,340.5->12,400->10���� ������ �ݾ� ����.
     //10������� 99.999�� ���� �� 100���� ���� �� 100�� ����
	int v =12340;
	int r2 =(int)(v+50.999)/100*100;
	System.out.println(r2);
      //12340+99.999=1243999->������ĳ����
	
	 //101p���� ����������
	int top =5;
	int bot =10;
	int h = 7;
	double t =(double)(top+bot)*h/2;
	System.out.println(t);
	
	boolean  kk, nn;
	String s,zz;
	int x = 10;
	int y = 5;
	kk = (x>7)&&(y<=5);
	 s = (kk)?"��" : "����";
	nn = (x%3==2) || (y%2!=1);
	zz = (nn)?"��" :"����";
	System.out.println(s);
	System.out.println(zz);
	} 
 public static void main(String[] args) {
	new Operator5();  
  }
}
