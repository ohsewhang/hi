package e_class;

public class Static {
	static int v1 = 5000; //������ �޼ҵ�(�����ڿ�)��� ��ü�� �ϳ��� ���� ���. �ʱ�ȭ�� 1ȸ�� �ȴ�. / Ŭ����.��� �� or ��ü��.����� ����ص� �ȴ�.
		   int v2 = 5000; //�ν��Ͻ��� ��ü�� ���ԵǾ��ִ� ��.(���)
	
	
	
	
	
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.v1 = 1000;
		s1.v2 = 1000;//s1�� ������ �ִ� v2
		
		Static s2 = new Static();
		System.out.println(s2.v1); //1000 �ʱ�ȭ�� �ѹ� �ǰ� �ʱ�ȭ ��������.
		System.out.println(Static.v1);//������ ����.
		System.out.println(s2.v2); //5000 ��� �ʱ�ȭ�� �Ȱ���.
	}

}
