package c_control;

public class Exam6 {
	Exam6(){
	
			for(int i = 1; i <=5 ; i++) {  
				for(int j=1 ; j <=(i) ; j++) { //j별의 개수/j <=6-i하면 반대로 ..
				System.out.print("*");
				}
				System.out.println();
			}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Exam6();
	}
}
