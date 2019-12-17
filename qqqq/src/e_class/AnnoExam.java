package e_class;

public class AnnoExam { //어노테이션

	//@Override//오버라이드는 재정의가 되었는지를 체크해준다;							//컨트롤+스페이스바 tostring
//public String toString() { //재정의
	
	//return "abc";
	//}
	
	@Override  //재정의하면 오세왕이 출력됌.
	public String toString() {
		return "오세왕";
	}
	
	public static void main(String[] args) {
		AnnoExam a = new AnnoExam();
		System.out.println(a);//해시코드 값.
	}
}