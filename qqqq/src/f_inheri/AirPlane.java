package f_inheri;

public class AirPlane {
	public AirPlane() {		//오버로딩
		System.out.println("일반 비행기");
	}
	public AirPlane(int tire) { //오버로딩
		System.out.println("타이어가 "+ tire +"개인 일반 비행기");
	}
	public void land() {//부모
		System.out.println("착륙합니다");
	
	}
	public void fly() { //부모 
		System.out.println("일반비행");
	}
	public void takeOff() {//부모
		System.out.println("이륙한다아아아아");
	}
}
