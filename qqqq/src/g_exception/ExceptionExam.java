package g_exception;

public class ExceptionExam {

	public static void main(String[] args) {
		//NullPointerException
		String data = null; //��Ʈ���̶� ��ü�� �����Ǳ� ��   1.  String data = null;
		//String data = ""; �̰� ��ü�� ������ ��. 			2. System.out.println(data.toString());<<���� //data�� null�̱� ������ ã�Ƽ� �� ���ڰ� ���⿡
		try { //�ؿ� ���� ������� Ʈ���� ĳġ ��
		System.out.println(data.toString());           //data�� ��ü�� ����Ҽ��ִ� �޼ҵ带 ����.//data�� null�̱� ������ ã�Ƽ� �� ���ڰ� ���⿡
		System.out.println("������ ���� ��� �����.");
		}catch(NullPointerException ex) {//NullPointerException�� �� ��� Exception ex �� �ᵵ �ȴ�. ĳġ���� �����Ҷ��� ������ ���������� ������� ����.���� ���� ���� ���´�. 
			System.out.println("���ڿ� ���� data�� ���� ����");
		}finally {
			System.out.println("���� �߻��� ������� ������ ����");
		}
		//ArrayIndexOutofBoundsException(÷�ڿ���)
		int[] s = {1,2,3};//÷�� 0,1,2
		try {
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(s[i]);
			} //�̰��� i<=3�� ���� ���� 4����. =�� ���� 3���� �ȴ�.		
		}catch(Exception ex) {
			ex.printStackTrace();//�����ڵ� ���
			
		}
			
		
		//System.out.println(s[3);//�ۼ��Ȱ��� [3]
		
		//NumberFormatException
		try {
		data = "123";//���鿡��
		int su = Integer.parseInt(data);//o
		}catch(NumberFormatException ex){		//data = "123a"; //���ڿ�a�� �ֱ⿡.
		 ex.printStackTrace();					//int su2 = Integer.parseInt(data);//x
		}finally {
			System.out.println("����ó��������");
		}
		//ClassCastException(����ȯ�� ���� ����)
	try {
		Car myCar = new Car(); //����
		sportsCar c = (sportsCar)myCar; //�θ� ���� �ڽ��� �����Ҽ�����
	}catch(Exception ex) {
		System.out.println("����ȯ�����߻�");
	}finally {
		System.out.println("��");
	}
		//sportsCar q = new sportsCar();
		//Car z = (Car)q;
		
	}

}



