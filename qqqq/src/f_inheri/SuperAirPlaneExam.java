package f_inheri;

public class SuperAirPlaneExam {

	public static void main(String[] args) {
		SuperAirPlane s = new SuperAirPlane();//s°¡ ÀÚ½Ä°´Ã¼ÀÎsuper sÀÇ °´Ã¼´Ù.
		s.takeOff();
		s.fly();
		s.flymode = SuperAirPlane.SUPERSONIC;
		s.fly(); //ÀÚ½Ä²¨ »ç¿ë
		s.flymode = SuperAirPlane.NORMAL;
		s.fly(); //ºÎ¸ð²¨¸¦ ¾¸.
		s.land();
	}

}
