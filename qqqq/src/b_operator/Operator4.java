package b_operator;

public class Operator4 {

   int a = 534;
   int b = 30;
   int ab = a/b; //학생들이 갖는 연필 수
   int abc = a%b; //남는 연필 수 
   Operator4(){
  System.out.println("학생들이 1명당 연필 수:"+ab);
  System.out.println("남는 연필 수:"+abc);
  
 
   }
  
  public static void main(String[] args) {
	 new Operator4();
	 
  }
}
