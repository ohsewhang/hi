package g_exception;

public class ProductExam_mmmmmm {

	public static void main(String[] args) {
		//1. Radio,Video �� ����ȯ�� �ȵ�.
		Radio r = new Radio();
		Video v = null;
		Product p = null;
		
		//���1 v = (Video)r;����!
		//���2 if(r instanceof Video) {
		//	System.out.println("ok");
		//}else {
		//	System.out.println("fail");
		//}
		//���3try {
		//	v = (Video)r;
		//}catch(ClassCastException e) {
		//	System.out.println("ĳ���þȴ�");
		//}
		//2. ���� ���� Ƽ��� ���δ�Ʈ�� ĳ����
		p = r; p= v;
		if(r instanceof Product) { //r���ȴ�..?
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
	
	}
}
