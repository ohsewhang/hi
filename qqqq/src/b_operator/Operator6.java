package b_operator;

public class Operator6 {
 Operator6(){
	 
	 double x =5.0;
	 double y = 3.0;
	 double z= x%y;
	 
	
	 if(y<=0.0) {
		 System.out.println("0.0으로 나눌 수 없습니다.");
	 } else {
	 double result =z+10;
	 System.out.println("결과 "+result);
	 }
 }
 public static void main(String[] args) {
	 new Operator6();	 
 }

}
