/*
 * �ۼ����� : 2019.11
 * �ۼ��� : osw
 * ���� �����ڿ� ���� ����
 */
package b_operator;

public class Operator {
  public Operator() {  //������:��ü�� �����ɶ� ����Ǵ� �޼ҵ�.
	  
	  
	  //������ ������test Ȧ¦�� �� Ư�� ���� ����� Ȯ���� �� ���.	 
	  System.out.println("12%5 ->"+ (12%5));
	  
	  //������ �����ڿ� 3�� ������ test
	  int n = 124;	                              //¦�������ƴ��� (==����)
	  String r = (n%2==0)? "¦��":"Ȧ��"; 
	  System.out.println( n + "==>" + r);                    
  
	  //���� ������
	  //��ġ ��ġ
	  int a = 10;
	  int b = 10;
	  a++;          //���� �� ��� ���� �Ȱ���.
	  ++b;
      System.out.println(a+"," +b); 
      int c = a++; //���� �� ��� ++�� ���߿� ���(��ġ)
      int d = ++b; //(��ġ)
      System.out.println(c+","+d);
      System.out.println(a+"," +b);
      // ���ڿ� 
      String name = "��";
      String irum = "��";
      String irum2 = new String("��");  //���ο� �޸𸮿� ����
      System.out.println(name==irum);  //name��irum�� ���ٰ� ����.
      System.out.println(name==irum2); //�ٸ��ٰ� ����.
      System.out.println(name.equals(irum));
      System.out.println(name.equals(irum2));//equals�� ���ڿ��θ� ����.
      
      
   
  }
    public static void main(String[] args) {
    new Operator();    //�޸𸮿� �÷���.������ �� ����.    
  }
}
