package b_operator;

public class Operator6 {
 Operator6(){
	 
	 double x =5.0;
	 double y = 3.0;
	 double z= x%y;
	 
	
	 if(y<=0.0) {
		 System.out.println("0.0���� ���� �� �����ϴ�.");
	 } else {
	 double result =z+10;
	 System.out.println("��� "+result);
	 }
 }
 public static void main(String[] args) {
	 new Operator6();	 
 }

}
