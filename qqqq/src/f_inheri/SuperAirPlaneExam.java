package f_inheri;

public class SuperAirPlaneExam {

	public static void main(String[] args) {
		SuperAirPlane s = new SuperAirPlane();//s�� �ڽİ�ü��super s�� ��ü��.
		s.takeOff();
		s.fly();
		s.flymode = SuperAirPlane.SUPERSONIC;
		s.fly(); //�ڽĲ� ���
		s.flymode = SuperAirPlane.NORMAL;
		s.fly(); //�θ𲨸� ��.
		s.land();
	}

}
