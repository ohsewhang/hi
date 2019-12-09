/*
 * 두 정수를 (매개변수로)전달 받아 합계를 반환하는 메소드 구현(sum)
 * 두 정수를 (x,y)전달 받아  x~y까지의 합계를 구하여라 리턴(sum2)
 * 가로 세로값을 실수형으로 전달받아 사각형의 넓이를 계산하여 리턴(sum3)
 * 구구단 수를 하나 전달받아 구구다한 하나의 문자열로 만들어 리턴(gugudan)
 */

package e_class;

public class Exam1 {
	int x = 0;
	int y = 0;
	
	int sum(int x,int y) {
		int sum = x + y;
		System.out.println(sum);
		return sum;
	}
	int sum2(int x,int y) {
		int sum = 0;
			
		for(int i = x ; i <= y ;i++) { //x가 y까지
			 sum+=i;
		}
		return sum;
	}
	
	double sum3(double n1, double n2) {
		return n1*n2;
		
	}
	
		void gugudan(int dan){
			for(int i =1; i<=9 ;i++) {
			 int result = dan*i;
			 System.out.println(dan+"*"+i+"="+result);
			 
		 }
	 }
	 String gugudan2(int dan) {
		 String r = "";
		 for(int i =1; i<=9 ;i++) {
			 int result =dan*i;
			 r +=(dan+"*"+i+"="+result);
			 r +="\n";
		 }
		 return r;
	 }
	 public static void main(String[] args) {
			Exam1 e1 = new Exam1(); 
			
			int r1 = e1.sum(20,30);//두정수를 전달받아쓰겠다. 매개변수를 여기서 써주네;
			System.out.println("두 수의 합:"+r1); 
			
			int r2 = e1.sum2(1, 8);
			System.out.println("합계:"+r2);
			
			double r3 = e1.sum3(10.0, 20.0);
			System.out.println("사각형의 넓이"+ r3);
			
			e1.gugudan(2);
			String r4 = e1.gugudan2(2);
			System.out.println("구구단");
			
		}
	 
	
	
}
