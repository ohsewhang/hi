package e_class;

public class AnnoExam { //������̼�

	//@Override//�������̵�� �����ǰ� �Ǿ������� üũ���ش�;							//��Ʈ��+�����̽��� tostring
//public String toString() { //������
	
	//return "abc";
	//}
	
	@Override  //�������ϸ� �������� ���.
	public String toString() {
		return "������";
	}
	
	public static void main(String[] args) {
		AnnoExam a = new AnnoExam();
		System.out.println(a);//�ؽ��ڵ� ��.
	}
}