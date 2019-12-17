package h_api3;
/*
 * String의 속도와 String Builder의 속도 비교!
 */
public class StringBuilderExam {
	public StringBuilderExam() { //생성자생성
		//String 속도
		
	long sTime=0, eTime=0;
	String str  = "";
	
	sTime = System.nanoTime();//시작시간
	for(int i = 0 ; i < 50000 ; i++) {
		str += "a";
	}
	
	eTime = System.nanoTime();//끝난시간
	
	System.out.println("String 처리시간:"+ (eTime-sTime));	
	
	
	//String bulider
	StringBuilder sb = new StringBuilder(100);
	sTime = System.nanoTime();
	for(int i = 0 ; i<50000 ; i++) {
		sb.append("a");
	}
	
	eTime = System.nanoTime();
	System.out.println("StringBuilder처리시간:"+(eTime-sTime));
	
	}
	
	public static void main(String[] args) {
		new StringBuilderExam();
	

	}	

}
