package f_inheri;

public class SuperAirPlane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; //상수처리
	
	public int flymode =NORMAL;
	
	public SuperAirPlane() {
		super(50);//매개변수가없는생성자 호출 //제일첫번째있어야한다.
		System.out.println("초음속비행기");
	}
	
	@Override	
	public void fly() {//자식
		if(flymode == NORMAL) {
			super.fly();
		}else {
			System.out.println("초음속ㄱ비행");
		}
	}
	
}
