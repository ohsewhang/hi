package h_api;

public class Key {
	public int number; //�ѹ��� ������..���� ���� �⺻������ ���õǾ�����
	
	public Key(int n) {
		this.number = n;
	}
	@Override               //�ؽ��ڵ� ������
	public int hashCode() { //�̰� �����ϸ� ���ϴ� ���� ���´�
		return this.number;
	}
	@Override //�ؿ� ���� �ߵƴ��� Ȯ��
	public boolean equals(Object obj) {  //�Ű������� ��� �ڹٺ����� ���� �� �ִ� ������Ʈ�� ����
		
		boolean b =false;
		
		if(obj instanceof Key) {  //���� key�� ������� object��.
		Key k = (Key)obj;//���� ������ƮŸ���� Ű Ÿ������ ������ȯ�ҰŴ�.
		if(this.number == k.number) {
			b = true;
		}
		}
		
		return b;
	
	}
	
}
	
