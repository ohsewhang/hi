package e_class;

public class ArrayParam2 {
                                //studentŬ������ ���Ŵ�
	void input(int s) {
	//TODO
		
		
		
		
	}
	
	
				//�������	//ap2.input(new Student());�� ��Ʃ��Ʈs�� ����.�ٵ� �̷��� ���� ���°� x
	void input(Student s) {     // �޼ҵ�    ,������ �ִ°� �ҷ���
		s.prn();				//��Ʃ��Ʈ�� �Ķ���͸� ���� ��ǲ�� 
	}
	//�Ű����� ���� Car�� �޼ҵ�
	 void input(Car c){ // new Car();�� ����ų� new Car("abc");�ų� new Car("abc","���")�̰ų� new Car("abc","���","300);input�ߺ����𰡴� ������ Ÿ���� �ٸ�. �����ε�(�ߺ�����)
		System.out.println(c.model); 
		System.out.println(c.color);                                //�𸥴ٸ� �ϴ� ����غ���.
		System.out.println(c.maxspeed);
	 	
	 }
	
	 
	
	
	
	
	public static void main(String[] args) {
		
		ArrayParam2 ap2 = new ArrayParam2();
		Car ca =new Car();
		ap2.input(ca);
		Student std = new Student();
		ap2.input(std);	//�̷��� ���� ���� student s (s.prn)����.
		
		System.out.println("--------------");
		Car c1 = new Car();
		ap2.input(c1);
		Car c2 = new Car("����","����",400);
		ap2.input(c2);
		
		
	}
}
