package g_exception;
                                    //���� ���ѱ��
public class ExceptionExam2 {

	
	public ExceptionExam2() throws Exception { //������
		this.method();			//�����ڰ� throdws Excetuion�� �ؼ� �������� ��.
	}
	
	
	
	public void method()throws Exception {//�޼ҵ� //����ó�� throws Exception���� ������.�����ڿ���
		int su = 100;
		int su2=10;//÷��0
		System.out.println(su/su2);
		throw new Exception("������ ���ܸ� �߻���Ŵ");
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			new ExceptionExam2(); //���⼭ try catch�� ����.
		} catch (Exception e) {
			System.out.println("���α׷��� ��������� 0���� ������.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			System.out.println("��");
	}		
}
