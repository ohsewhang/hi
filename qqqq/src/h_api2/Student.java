package h_api2;

public class Student{
	
	public int sno;  //�й�  //�ʵ�
	public String name;//�̸�
	public int score;//����
	
	
	Student(int sno){ //������
		this.sno = sno; //�ʵ�
	}

	Student(int sno, String name, int score){//�Ű������� ���޹���
		this.sno =sno;
		this.name = name;
		this.score = score;
	}
	@Override//������Ʈ�� �������ִ� ����Ʈ���̶��(�ڱ��ڽ��ؽ���)���� �����´�
	public String toString() {
		return sno + " - " +name+" - "+ score; 
	}
}
