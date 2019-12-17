package g_exception;

public class ProductExam_mmmmmm {

	public static void main(String[] args) {
		//1. Radio,Video 는 형변환이 안됨.
		Radio r = new Radio();
		Video v = null;
		Product p = null;
		
		//방법1 v = (Video)r;오류!
		//방법2 if(r instanceof Video) {
		//	System.out.println("ok");
		//}else {
		//	System.out.println("fail");
		//}
		//방법3try {
		//	v = (Video)r;
		//}catch(ClassCastException e) {
		//	System.out.println("캐스팅안댐");
		//}
		//2. 비디오 라디오 티비는 프로덕트로 캐스팅
		p = r; p= v;
		if(r instanceof Product) { //r만된다..?
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
	
	}
}
