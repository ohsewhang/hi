package f_inheri;

public class MyCar {
	KumhoTire[] front = new KumhoTire[2]; // fl,fr,b1,br; 
	HankuTire[] back  = new HankuTire[2]; //�޹��� �ΰ�
	
	Tire[] tire = new Tire[4];//��ȣ�� �ѱ��̵� �� �����ְ�.�Ѱ�����
	
	
	

	public static void main(String[] args) { //��� mycar�� ��������
		MyCar m = new MyCar(); //����
		m.tire[0] = new KumhoTire(); //Ÿ�̾�Ÿ���� �������
		//m.front[0] = new HankuTire(); // Ÿ���� �ٸ���. front�� new KunhoTireŸ�Ը� 
		m.back[0] = new HankuTire(); //��� ����.���� �ѱ���.
		
		m.tire[0].run();//�Ǥ���
		m.back[0].run();//����
		
		//instance��ü�� Hanku Tire�� ��������ִ°�� �� /���� ��� ĳ����o /�޽� ĳ����x
		Tire h2 = new KumhoTire();
		HankuTire h1 = new HankuTire();
		if(h1 instanceof HankuTire) {
			System.out.println("�ѱ�Ÿ�̾�� �������");
		}else {
			System.out.println("�ѱ�Ÿ�̿��� �������������");
		}
		
		
		
		
	}

}
