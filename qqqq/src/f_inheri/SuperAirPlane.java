package f_inheri;

public class SuperAirPlane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; //���ó��
	
	public int flymode =NORMAL;
	
	public SuperAirPlane() {
		super(50);//�Ű����������»����� ȣ�� //����ù��°�־���Ѵ�.
		System.out.println("�����Ӻ����");
	}
	
	@Override	
	public void fly() {//�ڽ�
		if(flymode == NORMAL) {
			super.fly();
		}else {
			System.out.println("�����Ӥ�����");
		}
	}
	
}
